package org.in.prix.sample.spring4.sample3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample3 {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Rectangle rectangle = context.getBean("rectangle", Rectangle.class);
        rectangle.draw();
    }
}
