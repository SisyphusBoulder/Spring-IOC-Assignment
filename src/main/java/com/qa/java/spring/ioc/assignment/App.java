package com.qa.java.spring.ioc.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.java.spring.ioc.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-------------");
        Customer customer1 = context.getBean("customer1", Customer.class);
        System.out.println(customer1);
        
        Customer customer2 = context.getBean("customer2", Customer.class);
        System.out.println(customer2);
        
        ((ConfigurableApplicationContext)context).close();
    }
}
