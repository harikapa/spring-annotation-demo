package com.stackroute.domain;

import org.springframework.context.annotation.*;

//registering it as configuration class
@Configuration

//path of property file
@PropertySource(value = "classpath:ClassPropertieValues.properties")
public class SpringConfig {

    @Bean
    public Actor ram()
    {
        return new Actor("ram","male",28);
    }

    //creating bean 
    @Bean
    @Scope("prototype")
    public Movie ismartShankar()
    {
        return new Movie(ram());
    }

    @Bean
    @Scope("prototype")
    public Movie ismartShankar1()
    {
        return new Movie(ram());
    }


}
