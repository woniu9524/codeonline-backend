package com.codeonline.k8s.service.Impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.k8s.mapper.NfsMapper;
import com.codeonline.k8s.service.INfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

@Service
public class NfsServiceImpl implements INfsService {

    @Autowired
    private NfsMapper nfsMapper;

    @Value("${nfs.path}")
    private String nfsBasePath;

    @Override
    public AjaxResult selectLabFilesByLabId(Long courseId, String labId, Long userId) {
        Long teacherId = nfsMapper.selectUserIdByCourseId(courseId);
        nfsBasePath = "C:/Users/Administrator/Desktop/data/nfs";
        List<Map<String, Object>> fileTree = new ArrayList<>();
        String path = "";
        if (Objects.equals(teacherId, userId)) {
            path = nfsBasePath + "/" + teacherId + "/" + labId;
        } else {
            path = nfsBasePath + "/" + teacherId + "/" + labId+"/"+userId;
        }
//        path="G:\\nacos-server-2.1.2\\nacos\\bin";
        showList(new File(path), fileTree);
        fileTree = (List<Map<String, Object>>) fileTree.get(0).get("children");

        return AjaxResult.success(fileTree);
    }


    private void showList(File file, List<Map<String, Object>> fileTree) {
        Map<String, Object> map = new HashMap<>();
        if (file.isDirectory()) {//如果是目录
            map.put("text", file.getName());
            map.put("path", file.getPath());
            map.put("opened", false);
            List<Map<String, Object>> childTree = new ArrayList<>();
            File[] listFiles = file.listFiles();//获取当前路径下的所有文件和目录,返回File对象数组
            for (File f : listFiles) {//将目录内的内容对象化并遍历
                showList(f, childTree);
            }
            map.put("children", childTree);
            fileTree.add(map);
        } else if (file.isFile()) {//如果是文件
            map.put("text", file.getName());
            map.put("path", file.getPath());
            map.put("icon", "icon-hide");
            fileTree.add(map);
        }
    }
}
