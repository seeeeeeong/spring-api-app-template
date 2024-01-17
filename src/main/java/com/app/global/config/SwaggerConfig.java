package com.app.global.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(apiInfo())
                .components(components())
                .addSecurityItem(securityRequirement());
    }

    private Info apiInfo() {
        return new Info()
                .version("1.0")
                .title("API 문서")
                .description("API에 대한 설명 문서입니다.");
    }

    private Components components() {
        String authorizationSchemeName = "Authorization";
        return new Components()
                .addSecuritySchemes(authorizationSchemeName, new SecurityScheme()
                        .name(authorizationSchemeName)
                        .in(SecurityScheme.In.HEADER)
                        .type(SecurityScheme.Type.APIKEY)
                        .description("API 키를 'Bearer {access_token}' 형식으로 입력하세요"));

    }

    private SecurityRequirement securityRequirement() {
        String authorizationSchemeName = "Authorization";
        return new SecurityRequirement().addList(authorizationSchemeName);
    }
}
