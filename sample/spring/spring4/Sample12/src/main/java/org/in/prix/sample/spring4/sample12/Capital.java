package org.in.prix.sample.spring4.sample12;

public class Capital {

    String capitalName;

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    // Added to demonstrate the destroy behavior for singleton and prototype
    private void destroy() {
        // this wont be called
        System.out.println("Capital Destroy Method Called");
    }
}
