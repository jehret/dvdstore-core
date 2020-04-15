package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 *
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.repository.file","com.mycompany.dvdstore.service","com.mycompany.dvdstore.controller"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);

        MovieController movieController=context.getBean(MovieController.class);

        movieController.addUsingConsole();
    }
}
