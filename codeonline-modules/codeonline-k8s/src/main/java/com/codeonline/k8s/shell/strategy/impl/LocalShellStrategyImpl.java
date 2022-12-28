package com.codeonline.k8s.shell.strategy.impl;


import com.codeonline.k8s.shell.util.LocalExecuteUtil;
import com.codeonline.k8s.shell.strategy.IShellStrategy;
import org.springframework.stereotype.Component;

@Component
public class LocalShellStrategyImpl implements IShellStrategy {
    @Override
    public String exec(String cmd) {
        return LocalExecuteUtil.executeNewFlow(cmd);
    }
}
