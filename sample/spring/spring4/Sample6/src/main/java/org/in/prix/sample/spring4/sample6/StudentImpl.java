package org.in.prix.sample.spring4.sample6;

import org.in.prix.sample.spring4.sample6.Address;

public class StudentImpl implements Student {

    private String  name;
    private int     age;
    private String  sex;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showDetails() {
        System.out.println("--------------");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Sex:" + sex);
        System.out.println("Address:" + (null != address ? address.getAddress() : null));
    }

}
