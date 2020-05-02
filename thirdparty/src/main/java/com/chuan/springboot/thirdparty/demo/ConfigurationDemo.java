package com.chuan.springboot.thirdparty.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hechuan
 */
@Configuration
// @ConditionalOnClass(XXX.class)
public class ConfigurationDemo {

    @Bean
    public HelloBean getHelloBean() {
        return new HelloBean();
    }
}
