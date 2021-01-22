package com.zutasssociation.admin;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 黄玉东
 * @version 1.0
 * @date 2021/1/19 13:56
 * web容器中进行部署
 */
public class ZutAssociationServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ZutAssociationApplication.class);
    }
}
