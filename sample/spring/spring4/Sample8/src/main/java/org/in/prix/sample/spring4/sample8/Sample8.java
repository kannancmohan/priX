package org.in.prix.sample.spring4.sample8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample8 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student1 = context.getBean("student", Student.class);
        student1.showDetails();

    }
}
