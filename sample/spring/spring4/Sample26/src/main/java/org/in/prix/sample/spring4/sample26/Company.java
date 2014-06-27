package org.in.prix.sample.spring4.sample26;

public class Company {

    private Employee employee;

    public void init() {
        System.out.println("    Inside Company.init");
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
