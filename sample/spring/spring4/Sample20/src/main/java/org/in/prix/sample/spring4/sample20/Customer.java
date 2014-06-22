package org.in.prix.sample.spring4.sample20;

public class Customer {

    private final Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public void printAddress() {
        System.out.println(address.getAddress());
    }
}
