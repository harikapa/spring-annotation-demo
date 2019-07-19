package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        //initializing ApplicationContext with configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie ismartShankar = context.getBean("ismartShankar",Movie.class);
        ismartShankar.displayActorDetails();

        Movie ismartShankar1 = context.getBean("ismartShankar",Movie.class);
        ismartShankar1.displayActorDetails();

        //verifying scope
        System.out.println(ismartShankar == ismartShankar1);

        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("beanLifecycleDemoBean", BeanLifecycleDemoBean.class);

        ((AnnotationConfigApplicationContext) context).close();

    }

}
