package com.deepu.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI myCustomConfig(){
        return new OpenAPI().info(
                new Info().title("Journal App APIs")
                        .description("By deepak")
        ).servers(Arrays.asList(new Server().url("http://localhost:8081").description("local"),
                new Server().url("http://localhost:8085").description("Live")));
    }
}
