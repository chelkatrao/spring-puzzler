package org.puzzlers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String getBean() {
        return "hello world";
    }
}
