package org.in.prix.sample.spring4.sample21;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample21 {

    public static void main(String[] args) {
        System.out.println("%%%%%%%%%%%STARTING THE CONTEXT %%%%%%%%%%%%%");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // uncomment the following and also set the Customer.isAutoStartup to false and see the difference
        // context.start();
        System.out.println("%%%%%%%%%%%REFRESHING THE CONTEXT %%%%%%%%%%%%%");
        context.refresh();

        System.out.println("%%%%%%%%%%%CLOSING THE CONTEXT %%%%%%%%%%%%%");
        context.close();
    }
}
