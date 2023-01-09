package com.codeonline.k8s;

import com.codeonline.common.security.annotation.EnableCustomConfig;
import com.codeonline.common.security.annotation.EnableRyFeignClients;
import com.codeonline.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class CodeOnlineK8sApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeOnlineK8sApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  K8s模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}
