package com.codeonline;


import com.codeonline.shell.ShellMan;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.io.IOException;
import java.util.Arrays;


@SpringBootTest(classes=CodeOnlineHarborApplication.class)
public class test{

    @Autowired
    private ShellMan shellMan;

    @Test
    public void shellTest() throws IOException {
        System.out.println(shellMan.exec("ls"));;
    }
}
