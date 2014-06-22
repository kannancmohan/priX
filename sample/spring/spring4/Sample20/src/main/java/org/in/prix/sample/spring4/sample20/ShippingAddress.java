package org.in.prix.sample.spring4.sample20;

public class ShippingAddress implements Address {

    String address1;
    String address2;

    public String getAddress() {
        return "BillingAddress [address1=" + address1 + ", address2=" + address2 + "]";
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

}
