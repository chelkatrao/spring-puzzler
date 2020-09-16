package org.chelkatrao.puzzlerTwo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;

@Configuration
public class Config {

    @Value("${JAVA_HOME}")
    private String javaHome;

    @PostConstruct
    public void init() {
        System.out.println("javaHome = " + javaHome);
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
