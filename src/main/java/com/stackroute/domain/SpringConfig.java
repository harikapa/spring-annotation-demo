package com.stackroute.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
@PropertySource(value = "classpath:ClassPropertieValues.properties")
public class SpringConfig {



}
