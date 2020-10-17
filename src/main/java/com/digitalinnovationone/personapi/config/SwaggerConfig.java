package com.digitalinnovationone.personapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.digitalinnovationone.personapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("PersonAPI",
                "API desenvolvida no Bootcamp Java da Digital Innovation One",
                "v1.0",
                "https://docs.github.com/pt/free-pro-team@latest/github/site-policy/github-community-guidelines",
                new Contact("Eduardo Ribeiro Cury", "https://github.com/eduardorcury/personapi-java-bootcamp", "eduardoribeirocury@gmail.com"),
                "Todos os direitos aos desenvolvedores",
                "https://docs.github.com/pt/free-pro-team@latest/github/site-policy/github-community-guidelines",
                Collections.emptyList()
        );
    }
}
