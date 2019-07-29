package com.StackRoute;
import com.StackRoute.domain.Actor;
import com.StackRoute.domain.Movie;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.StackRoute.domain")
@PropertySource("Actor.properties")
public class ConfigurationClass {

    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }

    @Bean
    public Actor actor1(){
        Actor actor=new Actor("Anil","male",23);
        return actor;
    }


    @Bean(name = "movie1")
    @Scope("prototype")
    public Movie movie(){
        Movie movie=new Movie(actor1());
        return movie;
    }

}
