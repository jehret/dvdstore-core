package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 *
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {

        //ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context= SpringApplication.run(App.class,args);

        MovieController movieController=context.getBean(MovieController.class);

        movieController.addUsingConsole();
    }
}
