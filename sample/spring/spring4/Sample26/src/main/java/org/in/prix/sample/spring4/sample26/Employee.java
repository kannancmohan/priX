package org.in.prix.sample.spring4.sample26;

public class Employee {
    private String name;

    public void init() {
        System.out.println("    Inside Employee.init");
        System.out.println("    This wont be called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
