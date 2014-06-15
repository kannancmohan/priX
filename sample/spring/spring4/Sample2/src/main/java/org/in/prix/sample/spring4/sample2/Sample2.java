package org.in.prix.sample.spring4.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Circle circle = context.getBean("circle", Circle.class);
        circle.draw();

    }
}
