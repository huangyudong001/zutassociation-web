package com.zutassociation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author 黄玉东
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZutAssociationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZutAssociationApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
