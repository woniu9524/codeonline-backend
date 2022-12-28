package com.codeonline;


import com.codeonline.harbor.CodeOnlineHarborApplication;
import com.codeonline.harbor.shell.ShellMan;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.IOException;


@SpringBootTest(classes= CodeOnlineHarborApplication.class)
public class test{

    @Autowired
    private ShellMan shellMan;

    @Test
    public void shellTest() throws IOException {
        System.out.println(shellMan.exec("ls"));;
    }
}
