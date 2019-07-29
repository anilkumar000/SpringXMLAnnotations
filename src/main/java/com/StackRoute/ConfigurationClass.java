package com.StackRoute;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.StackRoute.domain")
@PropertySource("Actor.properties")
public class ConfigurationClass {


}
