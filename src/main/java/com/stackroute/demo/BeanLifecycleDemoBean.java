package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After propeties set method entered..");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Method entered...");
    }

    public void customInit()
    {
        System.out.println("Custom Init method entered..");
    }

    public void customDestroy()
    {
        System.out.println("Custom Destroy Method entered..");
    }
}
