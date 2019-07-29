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
    public Movie movie(){
        Movie movie=new Movie();
        return movie;
    }
    @Bean(name = "lifeCycle")
    public BeanLifeCycleDemo beanLifeCycleDemo(){
        BeanLifeCycleDemo beanLifeCycleDemo=new BeanLifeCycleDemo();
        return beanLifeCycleDemo;
    }

    @Bean(name="postProcessing")
    public BeanPostProcessorDemo beanPostProcessorDemo(){
        BeanPostProcessorDemo beanPostProcessorDemo=new BeanPostProcessorDemo();
        return beanPostProcessorDemo;
    }

}
