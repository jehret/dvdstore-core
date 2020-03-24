package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        MovieController movieController=context.getBean(MovieController.class);

        movieController.addUsingConsole();
    }
}
