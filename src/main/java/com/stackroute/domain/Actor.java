package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    @Value("${actor.name}")
    private String name;

    @Value("${actor.gender}")
    private String gender;

    @Value("${actor.age}")
    private Integer age;
//
//    public Actor(String name, String gender, Integer age) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    public void display()
    {
        System.out.println("Actors details : \n name : " + this.name +"\n gender : " + this.gender + "\n age :" +this.age  );
    }
}
