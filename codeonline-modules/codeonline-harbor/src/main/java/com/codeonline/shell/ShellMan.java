package com.codeonline.shell;

import com.codeonline.shell.strategy.IShellStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class ShellMan {
    @Autowired
    @Qualifier("localShellStrategyImpl")
    private IShellStrategy localShellStrategyImpl;

    @Autowired
    @Qualifier("SSHShellStrategyImpl")
    private IShellStrategy  sshShellStrategyImpl;

    @Value("${ssh.enable}")
    private String  sshEnable;


    public String exec(String cmd) throws IOException {
        if ("true".equals(sshEnable)){
            return sshShellStrategyImpl.exec(cmd);
        }else {
            return localShellStrategyImpl.exec(cmd);
        }
    }
}
