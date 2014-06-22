package org.in.prix.sample.spring4.sample16;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample16 {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        PizzaStore store = context.getBean("pizzaStore", PizzaStore.class);
        store.getDetails();
    }
}
