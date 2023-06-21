package org.example;

import org.example.service.GlobMartService;
import org.example.service.GlobMartServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    @Primary
    public GlobMartService globMartService(){
        return new GlobMartServiceImpl();
    }

}
