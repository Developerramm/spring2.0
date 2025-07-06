package com.app.beans;

import java.util.Date;
import java.util.Map;

public class CollegeInfo {

    private Map<String, String> hod;
    private Map<String, Date> holiday;

    @Override
    public String toString() {
        return "CollegeInfo [hod=" + hod + ", holiday=" + holiday + "]";
    }

    public void setHod(Map<String, String> hod) {
        this.hod = hod;
    }

    public void setHoliday(Map<String, Date> holiday) {
        this.holiday = holiday;
    }

}
