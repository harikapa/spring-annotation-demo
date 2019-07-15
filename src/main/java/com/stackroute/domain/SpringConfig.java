package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
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

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }
}
