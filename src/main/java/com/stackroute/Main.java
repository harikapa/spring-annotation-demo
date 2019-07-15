package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie ismartShankar = context.getBean("ismartShankar",Movie.class);
        ismartShankar.displayActorDetails();

        Movie ismartShankar1 = context.getBean("ismartShankar",Movie.class);
        ismartShankar1.displayActorDetails();

        System.out.println(ismartShankar == ismartShankar1);

        ((AnnotationConfigApplicationContext) context).close();

    }

}
