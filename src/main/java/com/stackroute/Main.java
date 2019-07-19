package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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

        ((AnnotationConfigApplicationContext) context).close();

    }

}
