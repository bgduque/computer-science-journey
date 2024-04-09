package logic;

public class Employee {
    private String empNo, lastName, firstName;
    private Double salary;

    /*
     * 
     * 
     * 
     * The getters and setters function for this program has to be overloaded.
     * This is due to that if the programmer uses this class as an API, 
     * it is dependable and much be able to handle different types of data.
     * 
     * One is being wrapper class and the one is a primitive data type.
     * 
     * 
     * 
     * Copyright © Boris Gamaliel D. Duque — https://github.com/bgduque
     */

    public String getempNo() {
        return empNo;
    }

    public String getlastName() {
        return lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public Double getSalary() {
        return salary;
    }
    
    public double getSalary(double salary) {
        return salary;
    }

    public void setempNo(String empNo) {
        this.empNo = empNo;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setsalary(Double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
