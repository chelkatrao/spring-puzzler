package org.chelkatrao.puzzlerOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaruchConfig {

    @Bean
    @BaruchQualifier
    public String txt1() {
        return "Groovy";
    }

    @Bean
    @BaruchQualifier
    public String txt2() {
        return "Spring";
    }

    @Bean
    @BaruchQualifier
    public String txt3() {
        return "Artifactory";
    }

}
