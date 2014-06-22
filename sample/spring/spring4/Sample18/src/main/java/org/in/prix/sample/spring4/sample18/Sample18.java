package org.in.prix.sample.spring4.sample18;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample18 {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Customer customer = context.getBean("customer", Customer.class);
        customer.buyAnItem();
    }
}
