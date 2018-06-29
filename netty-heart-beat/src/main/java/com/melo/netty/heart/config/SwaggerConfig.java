package com.melo.netty.heart.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
@Configuration
@EnableSwagger2
/** 是否打开swagger */
@ConditionalOnExpression("'${swagger.enable}' == 'true'")
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.melo.netty.heart.contorller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("sbc order api")
                .description("sbc order api")
                .termsOfServiceUrl("http://melo.top")
                .contact("melo")
                .version("1.0.0")
                .build();
    }
}
