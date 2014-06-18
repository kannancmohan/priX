package org.in.prix.sample.spring4.sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample6 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.showDetails();

        Student student2 = context.getBean("student2", Student.class);
        student2.showDetails();

    }
}
