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
    public Movie movie(){
        Movie movie=new Movie(actor());
        return movie;
    }

}
