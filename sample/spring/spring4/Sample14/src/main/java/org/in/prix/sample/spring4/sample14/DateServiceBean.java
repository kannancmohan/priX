package org.in.prix.sample.spring4.sample14;

public class DateServiceBean {

    private CurrentDateTime defaultTime;

    public CurrentDateTime getDefaultTime() {
        return defaultTime;
    }

    public void setDefaultTime(CurrentDateTime defaultTime) {
        this.defaultTime = defaultTime;
    }

    public CurrentDateTime getCurrentDateTime(String formatte) {
        System.out.println("This will not be printed....");
        return null;
    }
}
