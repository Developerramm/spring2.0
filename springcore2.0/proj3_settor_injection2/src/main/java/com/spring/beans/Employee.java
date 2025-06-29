package com.spring.beans;

import java.util.Date;

public class Employee {
    private String empName;

    // dependent class here 
    private Date empDob;
    private String dpt;

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }
    public void setDpt(String dpt) {
        this.dpt = dpt;
    }
    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empDob=" + empDob + ", dpt=" + dpt + "]";
    }
    
}
