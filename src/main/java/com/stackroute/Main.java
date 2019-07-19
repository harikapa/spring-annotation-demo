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
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //initialize Application context with configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie ismartShankar = context.getBean("ismartShankar",Movie.class);
        ismartShankar.displayActorDetails();
        
        //initialize BeanFactory with configuration class
        BeanFactory beanFactory = new ConfigurableBeanFactory(new ClassPathResource(SpringConfig.class));
        Movie maharshi = beanFactory.getBean("maharshi",Movie.class);
        maharshi.displayActorDetails();

        //initialize BeanFactory with configuration class
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionRegistry beanDefinitionRegistry = new GenericApplicationContext(factory);
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(SpringConfig.class);

        ((AnnotationConfigApplicationContext) context).close();

    }

}
