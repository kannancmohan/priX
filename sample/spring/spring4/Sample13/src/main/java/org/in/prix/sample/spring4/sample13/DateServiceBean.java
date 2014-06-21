package org.in.prix.sample.spring4.sample13;

public abstract class DateServiceBean {

    private CurrentDateTime defaultTime;

    public CurrentDateTime getDefaultTime() {
        return defaultTime;
    }

    public void setDefaultTime(CurrentDateTime defaultTime) {
        this.defaultTime = defaultTime;
    }

    /**
     * if you remove the abstract key from class and method,it will still work as expected
     * */
    public abstract CurrentDateTime getCurrentDateTime();
}
