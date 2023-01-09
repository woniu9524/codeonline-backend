package com.codeonline.k8s.utils;

import com.codeonline.k8s.shell.ShellMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/9 10:48 星期一
 * @Description:
 */
@Component
public class K8sUtil {

    @Autowired
    private ShellMan shellMan;

    /*
     *  获取一个可以使用的NodePort
     * */
    public Integer readNodePortCanUse() throws IOException {
        String exec = shellMan.exec("kubectl get svc --all-namespaces -o go-template='{{range .items}}{{range.spec.ports}}{{if .nodePort}}{{.nodePort}}{{\"\\n\"}}{{end}}{{end}}{{end}}'");
        String[] split = exec.split("\n");
        List<Integer> usedPorts = new ArrayList<>();
        for (String s : split) {
            usedPorts.add(Integer.valueOf(s));
        }
        // 默认端口范围：30000-32767，我使用30500-32767
        for (int i = 30500; i < 32767; i++) {
            if (!usedPorts.contains(i)) {
                return i;
            }
        }
        return null;
    }
}