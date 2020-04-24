package com.chuan.springboot.autoconfiguration.configuration;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author hechuan
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AutoConfigurationPackage
@Import(MyImportSelector.class)
public @interface EnableHelloWorldConfiguration {
}
