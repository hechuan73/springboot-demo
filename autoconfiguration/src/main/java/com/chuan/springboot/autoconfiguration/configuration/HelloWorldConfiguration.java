package com.chuan.springboot.autoconfiguration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hechuan
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
