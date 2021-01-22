package com.zutasssociation.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 黄玉东
 * @version 1.0
 * @date 2021/1/19 13:56
 * 启动程序
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZutAssociationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZutAssociationApplication.class, args);
    }
}
