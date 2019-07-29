package com.StackRoute.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor extends Movie{
    private String name;
    private int age;
    private String gender;

    public Actor(String name, String gender,int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }
    @Value("${actor.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("${actor.age}")
    public void setAge(int age) {
        this.age =age;
    }

    public String getGender() {
        return gender;
    }

    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

