package org.in.prix.sample.spring4.sample4;

public class StudentImpl implements Student {

    private String  name;
    private int     age;
    private String  sex;
    private Address address;

    public StudentImpl(String name) {
        this.name = name;
    }

    public StudentImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentImpl(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public StudentImpl(Address address) {
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
