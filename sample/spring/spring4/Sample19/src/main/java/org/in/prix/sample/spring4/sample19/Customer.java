package org.in.prix.sample.spring4.sample19;

public class Customer {

    private final PurchaseService purchaseService;

    public Customer(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public void buyAnItem() {
        purchaseService.addItem();
    }
}
