package com.juan.estevez.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dev.yml")
@Profile("dev")
public class PropertiesSourceDev {

}
