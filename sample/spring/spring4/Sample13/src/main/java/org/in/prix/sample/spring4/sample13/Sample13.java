package org.in.prix.sample.spring4.sample13;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample13 {

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        DateServiceBean dateService = context.getBean("dateService", DateServiceBean.class);
        for (int i = 0; i < 2; i++) {
            Thread.sleep(1000);
            System.out.println("---------------------");
            System.out.println(dateService.getDefaultTime().dateAsString());
            System.out.println(dateService.getCurrentDateTime().dateAsString());
            System.out.println("---------------------");
        }

    }
}
