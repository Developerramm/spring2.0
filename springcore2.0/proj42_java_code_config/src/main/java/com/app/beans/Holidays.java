package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// target spring bean class
@Component(value = "holiday")
public class Holidays {

    @Autowired
    @Qualifier("holidayDate")
    private Date date;

    public void checkHoliday() {
        if (date.getMonth() == 6) {
            if (date.getDate() == 14) {
                System.out.println("Today is leave day... weekedn");
            } else {
                System.out.println("No leave in the given date ");
            }
        }
    }

}
