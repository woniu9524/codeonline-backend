package com.codeonline.harbor.shell.strategy;

import java.io.IOException;
import java.util.List;

public interface IShellStrategy {
    String exec(String cmd) throws IOException;
}
