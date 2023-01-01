package com.codeonline.harbor.service.Impl;

import com.codeonline.common.core.exception.harbor.HarborShellException;
import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.harbor.api.RepositoryApi;
import com.codeonline.harbor.api.model.Repository;
import com.codeonline.harbor.mapper.HarborUploadMapper;
import com.codeonline.harbor.model.HarborUpload;
import com.codeonline.harbor.service.IUploadService;
import com.codeonline.harbor.shell.ShellMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class UploadServiceImpl implements IUploadService {

    private static final String BaseUrl = "D:/ruoyi/uploadPath/";

    @Autowired
    private ShellMan shellMan;

    @Autowired
    private HarborUploadMapper harborUploadMapper;

    @Autowired
    private RepositoryApi repositoryApi;

    @Value("${harbor.harborUrl}")
    private String harborUrl;
    @Value("${harbor.harborName}")
    private String harborName;
    @Value("${harbor.harborPassword}")
    private String harborPassword;
    @Value("${harbor.harborSpace}")
    private String harborSpace;

    @Override
    public AjaxResult dockerfileToImageAndPush(HarborUpload harborUpload) {
        // 截取目录和文件名，正则截去http://127.0.0.1:9300/statics/
        String url = harborUpload.getImageUrl();
        String[] split = url.split("http://.*?statics/");
        String path = split[1];
        path = BaseUrl + path;
        //TODO 此处假设path为：/root/test/dockerfile123
        path = "/root/test/dockerfile";
        //docker build
        String dockerfileName = harborUpload.getImageName() + ":" + harborUpload.getImageTag();
        String buildCommand = "docker build -f " + path + " -t " + dockerfileName + " .";
        try {
            String buildResult = shellMan.exec(buildCommand);
        } catch (IOException e) {
            throw new HarborShellException("docker build失败，错误信息：" + e.getMessage());
        }
        //docker push
        pushImage(path, dockerfileName);
        // 判断是否上传成功
        if(hasPushed(dockerfileName)){
            // 更新数据库
            harborUploadMapper.insertHarborUpload(harborUpload);
            return AjaxResult.success("上传成功");
        }
        return AjaxResult.error("上传失败");

    }

    @Override
    public AjaxResult loadImageAndPush(HarborUpload harborUpload) {
        // 截取目录和文件名
        String url = harborUpload.getImageUrl();
        String[] split = url.split("http://.*?statics/");
        String path = split[1];
        path = BaseUrl + path;
        //TODO 此处假设path为：/root/test/base-centos.tar
        path = "/root/test/centos-base-ssh.tar";

        // 使用命令的方式，加载镜像，打标签，登录harbor，再推送到harbor中去
        // TODO 此处应该用异步的方式，不然会阻塞
        String loadCMD = "docker load -i " + path;
        String sourceImageName = null;
        try {
            sourceImageName = shellMan.exec(loadCMD);//Loaded image: base-centos:1.0.0
            sourceImageName = sourceImageName.replace("Loaded image: ", "").replace("\n", "");
        } catch (IOException e) {
            // TODO 此处只考虑加载镜像包没考虑容器包，有时间应该补上
            throw new HarborShellException(String.format("加载镜像包失败，命令为:%s，报错信息：%s", loadCMD, e.getMessage()));
        }
        // 推送镜像
        pushImage(path, sourceImageName);
        // 判断是否推送成功
        if (hasPushed(sourceImageName)) {
            // 更新数据库
            harborUploadMapper.insertHarborUpload(harborUpload);
            return AjaxResult.success("推送成功");
        }
        return AjaxResult.error("推送失败");
    }

    public void pushImage(String path, String sourceImageName) {
        // 打标签  SOURCE_IMAGE[:TAG] 192.168.3.77:30002/codeonline-dev/REPOSITORY[:TAG]
        String tagCMD = String.format("docker tag %s %s/%s/%s", sourceImageName, harborUrl, harborSpace, sourceImageName);
        try {
            shellMan.exec(tagCMD);
        } catch (IOException e) {
            throw new HarborShellException(String.format("打标签失败，镜像名：%s，命令为:%s，报错信息为%s", sourceImageName, tagCMD, e.getMessage()));
        }
        // 登录harbor
        String loginCMD = String.format("docker login %s -u %s -p %s", harborUrl, harborName, harborPassword);
        try {
            String tagResult = shellMan.exec(loginCMD);//Login Succeeded
            //如果不包含Login Succeeded则说明登录失败
            if (!tagResult.contains("Login Succeeded")) {
                throw new HarborShellException(String.format("登录harbor失败，报错信息为%s", tagResult));
            }
        } catch (IOException e) {
            throw new HarborShellException(String.format("登录harbor失败，报错信息为%s", e.getMessage()));
        }
        // 推送到harbor docker push 192.168.3.77:30002/codeonline-all/REPOSITORY[:TAG]
        String pushCMD = String.format("docker push %s/%s/%s", harborUrl, harborSpace, sourceImageName);
        try {
            String pushResult = shellMan.exec(pushCMD);// digest: sha256
            //判断推送是否成功

        } catch (IOException e) {
            throw new HarborShellException(String.format("推送到harbor失败，命令为:%s，报错信息为%s", pushCMD, e.getMessage()));
        }
        // 删除本地镜像
        String deleteCMD = String.format("docker rmi %s", sourceImageName);
        try {
            shellMan.exec(deleteCMD);
        } catch (IOException e) {
            throw new HarborShellException(String.format("删除本地镜像失败，命令为:%s，报错信息为%s", deleteCMD, e.getMessage()));
        }
        // 删除本地打了标签的镜像
        String deleteTagCMD = String.format("docker rmi %s/%s/%s", harborUrl, harborSpace, sourceImageName);
        try {
            shellMan.exec(deleteTagCMD);
        } catch (IOException e) {
            throw new HarborShellException(String.format("删除本地打了标签的镜像失败，命令为:%s，报错信息为%s", deleteTagCMD, e.getMessage()));
        }
        // 删除本地镜像包
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
    }


    private boolean hasPushed(String sourceImageName) {
        // 判断是否已经推送过
        String name = sourceImageName.split(":")[0];
        String tag = sourceImageName.split(":")[1];
        Repository repository = repositoryApi.getRepository(name);
        if (repository == null) {
            return false;
        }
        List<String> repositoryTags = repositoryApi.getRepositoryTags(name);

        return repositoryTags.stream().anyMatch(tag::equals);


    }
}