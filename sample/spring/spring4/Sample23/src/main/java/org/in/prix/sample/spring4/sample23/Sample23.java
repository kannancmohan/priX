package org.in.prix.sample.spring4.sample23;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample23 {

    public static void main(String[] args) {
        System.out.println("%%%%%%%%%%%STARTING THE CONTEXT %%%%%%%%%%%%%");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("%%%%%%%%%%%EXPLICITILY START THE CONTEXT %%%%%%%%%%%%%");
        context.start();

        System.out.println("%%%%%%%%%%%REFRESHING THE CONTEXT AGAIN%%%%%%%%%%%%%");
        context.refresh();

        System.out.println("%%%%%%%%%%%CLOSING THE CONTEXT %%%%%%%%%%%%%");
        context.close();
    }
}
