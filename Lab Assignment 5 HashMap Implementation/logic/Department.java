package logic;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String depCode, depName;
    private double depTotalSalary;
    private List<Employee> employee;

    public Department() { 
        employee = new ArrayList<>();
    }
    
    public String getDepCode() {
        return depCode;
    }

    public String getDepName() {
        return depName;
    }

    public double getDepTotalSalary() {
        return depTotalSalary;
    }
    
    public List<Employee> getEmployees() {
        return employee;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setDepTotalSalary(double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }

    public void setDepTotalSalary(Double depTotalSalary) { 
        this.depTotalSalary = depTotalSalary;
    }

}
