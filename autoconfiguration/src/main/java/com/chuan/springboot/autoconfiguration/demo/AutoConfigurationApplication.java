package com.chuan.springboot.autoconfiguration.demo;

import com.chuan.springboot.autoconfiguration.configuration.EnableHelloWorldConfiguration;
import com.chuan.springboot.autoconfiguration.configuration.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author hechuan
 */
@SpringBootApplication
@EnableHelloWorldConfiguration
public class AutoConfigurationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutoConfigurationApplication.class);
        System.out.println(context.getBean(HelloWorld.class));
    }

}
