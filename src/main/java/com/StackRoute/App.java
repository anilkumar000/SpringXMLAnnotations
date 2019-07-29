package com.StackRoute;


import com.StackRoute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
//
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie);
        applicationContext.close();

    }
}
