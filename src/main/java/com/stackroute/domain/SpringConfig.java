package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource(value = "classpath:ClassPropertieValues.properties")
public class SpringConfig {

    @Bean
    public Actor ram()
    {
        return new Actor("ram","male",28);
    }

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
