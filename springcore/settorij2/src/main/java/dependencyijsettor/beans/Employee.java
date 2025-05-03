package dependencyijsettor.beans;

import java.util.Date;

public class Employee {


    private String empName;
    // Date is dependent class here 
    private Date empDob;
    private String dept;


    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Date getEmpDob() {
        return empDob;
    }
    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empDob=" + empDob + ", dept=" + dept + "]";
    }


    

}
