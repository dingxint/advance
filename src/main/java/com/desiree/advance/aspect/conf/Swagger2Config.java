package com.desiree.advance.aspect.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author dingxintian
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("desiree-doc")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .build()
                .apiInfo(productApiInfo());
    }

    private ApiInfo productApiInfo() {

        VendorExtension<String> stringVendorExtension = new VendorExtension<String>() {
            @Override
            public String getName() {
                return "name";
            }

            @Override
            public String getValue() {
                return "value";
            }
        };
        return new ApiInfo("XXX项目 Platform API",//大标题
                "描述",//简单的描述
                "1.0.0",//版本
                "服务条款",
                new Contact("dxt","www.desiree.com","123.com"),
                "The Apache License, Version 2.0",//链接显示文字
                "http://www.baidu.com"//网站链接
                , Collections.singleton(stringVendorExtension)
        );
    }

}
