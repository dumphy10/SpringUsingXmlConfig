package org.aadi.config;

import org.aadi.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppJavaConfig {

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
