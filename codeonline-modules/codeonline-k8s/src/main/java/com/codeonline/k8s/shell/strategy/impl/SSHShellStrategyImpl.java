package com.codeonline.k8s.shell.strategy.impl;


import com.codeonline.k8s.shell.strategy.IShellStrategy;
import com.codeonline.k8s.shell.util.SSHExecuteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SSHShellStrategyImpl implements IShellStrategy {
    @Autowired
    private SSHExecuteUtil sshExecuteUtil;

    @Override
    public String exec(String cmd) throws IOException {
        return sshExecuteUtil.exec(cmd);
    }
}
