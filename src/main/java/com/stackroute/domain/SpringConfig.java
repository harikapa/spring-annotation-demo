package com.stackroute.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//registering it as configuration class
@Configuration

//path of property file
@PropertySource(value = "classpath:ClassPropertieValues.properties")
@ComponentScan(basePackages = "com.stackroute.domain")
public class SpringConfig {



}
