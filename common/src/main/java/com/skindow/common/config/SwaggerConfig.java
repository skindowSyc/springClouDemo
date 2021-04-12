package com.skindow.common.config;

import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;


/**
 * @author Administrator
 * @date 2019/8/19
 */
@Configuration
@EnableSwagger2 // 启用 Swagger
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        Predicate<RequestHandler> predicate = input -> {

            Class<?> declaringClass = input.declaringClass();
            if (declaringClass == BasicErrorController.class)// 排除
            {
                return false;
            }
            if (declaringClass.isAnnotationPresent(RestController.class)) // 被注解的类
            {
                return true;
            }
            // 被注解的方法
            return input.isAnnotatedWith(ResponseBody.class);
        };
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.skindow.controller")) //扫描控制层的路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Welcome to my blog")  //标题
                .description("only test swagger") //描述
                .termsOfServiceUrl("https://blog.csdn.net/qq_42255763")
                .contact(new Contact("skindow", "https://blog.csdn.net/qq_42255763", "295317224@qq.com"))//作者
                .version("1.0")//版本
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}
