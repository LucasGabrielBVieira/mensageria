package com.lucasvieira.apiboleto.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("API BarCode")
                .description("API for barcode management")
                .contact(new Contact().name("Lucas Vieira").email("lucasvieira0420@gmail.com"))
                .version("1.0.0")
        );
    }

}
