package org.in.prix.sample.spring4.sample5;

public class Address {

    private String address1;
    private String address2;
    private String street;

    public String getAddress() {
        return "Address [address1=" + address1 + ", address2=" + address2 + ", street=" + street + "]";
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
