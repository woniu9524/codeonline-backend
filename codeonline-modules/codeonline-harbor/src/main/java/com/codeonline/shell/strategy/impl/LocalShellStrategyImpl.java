package com.codeonline.shell.strategy.impl;


import com.codeonline.shell.strategy.IShellStrategy;
import com.codeonline.shell.util.LocalExecuteUtil;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocalShellStrategyImpl implements IShellStrategy {
    @Override
    public String exec(String cmd) {
        return LocalExecuteUtil.executeNewFlow(cmd);
    }
}
