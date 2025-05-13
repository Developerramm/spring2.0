package springcore.bean;

import java.util.Date;
import java.util.Map;

public class Collegeinfo {
    private Map<String,String> hod;
    private Map<String,Date> holidays;

    


    public void setHod(Map<String, String> hod) {
        this.hod = hod;
    }
    public void setHolidays(Map<String, Date> holidays) {
        this.holidays = holidays;
    }
    
    public Map<String, String> getHod() {
        return hod;
    }
    public Map<String, Date> getHolidays() {
        return holidays;
    }
    @Override
    public String toString() {
        return "Collegeinfo [hod=" + hod + ", holidays=" + holidays + "]";
    }

    
}
