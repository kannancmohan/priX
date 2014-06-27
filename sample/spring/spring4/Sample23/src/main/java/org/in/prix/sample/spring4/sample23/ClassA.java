package org.in.prix.sample.spring4.sample23;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassA {

    private String name;

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Inside init :name: " + name);
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("Inside cleanUp");
    }

    public void setName(String name) {
        this.name = name;
    }

}
