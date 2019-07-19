package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.*;

//registering it as configuration class
@Configuration

//scans the base package for @component and create beans
@ComponentScan(basePackages = "com.stackroute.domain")

//path of property file
@PropertySource(value = "classpath:ClassPropertieValues.properties")
public class SpringConfig {

    @Bean
    public Actor ram()
    {

        return new Actor("Ram Pothineni","male",28);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        return new BeanLifecycleDemoBean();
    }

//    @Bean
//    @Scope("prototype")
//    public Movie ismartShankar()
//    {
//        return new Movie(ram());
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Movie ismartShankar1()
//    {
//        return new Movie(ram());
//    }


}
