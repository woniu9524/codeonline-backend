package com.codeonline.low;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.codeonline.common.security.annotation.EnableCustomConfig;
import com.codeonline.common.security.annotation.EnableRyFeignClients;
import com.codeonline.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.context.annotation.ComponentScan;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class CodeOnlineLowAdminApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CodeOnlineLowAdminApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  普通管理员模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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
