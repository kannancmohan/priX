package org.in.prix.sample.spring4.sample13;

import java.util.Date;

public class CurrentDateTime {

    Date date = new Date();

    public String dateAsString() {

        return date.toString() + String.valueOf(date.getTime());
    }

}
