package org.in.prix.sample.spring4.sample16;

public class PizzaStore {

    private String name;
    private String address;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void getDetails() {
        System.out.println("PizzaStore [name=" + name + ", address=" + address + ", location=" + location + "]");
    }

}
