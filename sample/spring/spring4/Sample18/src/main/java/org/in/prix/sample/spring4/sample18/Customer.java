package org.in.prix.sample.spring4.sample18;

public class Customer {

    private PurchaseService purchaseService;

    public void buyAnItem() {
        getPurchaseService().addItem();
    }

    public PurchaseService getPurchaseService() {
        return purchaseService;
    }

    public void setPurchaseService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

}
