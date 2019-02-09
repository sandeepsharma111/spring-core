package com.learn.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-app.xml");
        Employee employee=context.getBean(Employee.class);
        System.out.println("Employee:"+employee.hashCode());
        System.out.println("Address:"+employee);

    }


}
