package org.in.prix.sample.spring4.sample12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample12 {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Country country = context.getBean("country", Country.class);
        System.out.println(country.getCapital("india"));
        System.out.println(country.getCapital("spain"));
    }
}
