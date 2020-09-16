package org.chelkatrao.puzzlerOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JekaConfig {
    @Bean
    @JekaQualifier
    public List<String> message() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Groovy0");
        strings.add("Spring0");
        return strings;
    }
}
