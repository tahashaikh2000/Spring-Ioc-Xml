package com.niit;

import com.niit.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Product product = (Product)context.getBean("Product");
        System.out.println(product);
        Product product2 = (Product)context.getBean("Product2");
        System.out.println(product2);
        System.out.println( "Hello World!" );

    }
}
