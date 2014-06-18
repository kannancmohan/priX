package org.in.prix.sample.spring4.sample8;

public class StudentImpl implements Student {

    private String name;
    private int    age;
    private String sex;

    public StudentImpl createInstance(String name, int age, String sex) {
        StudentImpl student = new StudentImpl();
        student.setAge(age);
        student.setName(name);
        student.setSex(sex);
        return student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void showDetails() {
        System.out.println("--------------");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Sex:" + sex);
    }

}
