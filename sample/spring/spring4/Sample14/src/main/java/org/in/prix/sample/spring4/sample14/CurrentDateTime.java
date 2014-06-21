package org.in.prix.sample.spring4.sample14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    private final String formatter;
    Date                 date = new Date();

    public CurrentDateTime(String formatter) {
        this.formatter = formatter;
    }

    public String dateAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat(formatter);
        return sdf.format(date) + "   " + String.valueOf(date.getTime());
    }

}
