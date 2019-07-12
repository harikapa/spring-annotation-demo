package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    //@Value("${actor.name}")
    private String name;

    //@Value("${actor.gender}")
    private String gender;

    //@Value("${actor.age}")
    private Integer age;


    public Actor(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void display()
    {
        System.out.println("Actors details : \n name : " + this.name +"\n gender : " + this.gender + "\n age :" +this.age  );
    }
}
