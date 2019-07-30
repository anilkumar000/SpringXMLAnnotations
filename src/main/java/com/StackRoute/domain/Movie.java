package com.StackRoute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware   {

    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }


    public Actor getActor() {
        return actor;
    }
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Movie BeanFactory: " + beanFactory.toString());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Movie BeanName: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Movie ApplicationContext: " + applicationContext.toString());
    }


}
