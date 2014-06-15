package org.in.prix.sample.spring4.sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample4 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.showDetails();

        Student student2 = context.getBean("student2", Student.class);
        student2.showDetails();

        Student student3 = context.getBean("student3", Student.class);
        student3.showDetails();

        Student student4 = context.getBean("student4", Student.class);
        student4.showDetails();

        Student student5 = context.getBean("student5", Student.class);
        student5.showDetails();
    }
}
