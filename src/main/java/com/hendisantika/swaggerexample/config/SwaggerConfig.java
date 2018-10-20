package com.hendisantika.swaggerexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/5/17
 * Time: 7:53 AM
 * To change this template use File | Settings | File Templates.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
//    @Bean
//    public Docket apiDocket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .paths(regex("/api/*"))
//                .build();
//    }

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.hendisantika.swaggerexample"))
                .paths(PathSelectors.regex("/api.*"))
                .build().apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Employee API Example")
                .description("A implementation of an API Gateway for Keyhole Labs Microservice Reference.")
                .contact(new Contact("Hendi Santika Software", "hendisantika", "hendisantika@yahoo.co.id"))
                .version("2.0")
                .build();
    }
}
