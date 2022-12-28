package com.codeonline.harbor.shell.strategy.impl;


import com.codeonline.harbor.shell.strategy.IShellStrategy;
import com.codeonline.harbor.shell.util.LocalExecuteUtil;
import org.springframework.stereotype.Component;

@Component
public class LocalShellStrategyImpl implements IShellStrategy {
    @Override
    public String exec(String cmd) {
        return LocalExecuteUtil.executeNewFlow(cmd);
    }
}
