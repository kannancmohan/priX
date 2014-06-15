package org.in.prix.sample.spring4.sample5;

public class Address {

    private final String address1;
    private final String address2;
    private final String street;

    public Address(String address1, String address2, String street) {
        this.address1 = address1;
        this.address2 = address2;
        this.street = street;
    }

    public String getAddress() {
        return "Address [address1=" + address1 + ", address2=" + address2 + ", street=" + street + "]";
    }

}
