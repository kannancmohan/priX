package org.in.prix.sample.spring4.sample26;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample26 {

    public static void main(String[] args) {
        System.out.println("%%%%%%%%%%%STARTING THE CONTEXT %%%%%%%%%%%%%");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println("Employe Name after Intilaization:" + company.getEmployee().getName());
        System.out.println("%%%%%%%%%%%CLOSING THE CONTEXT %%%%%%%%%%%%%");
        context.close();
    }
}
