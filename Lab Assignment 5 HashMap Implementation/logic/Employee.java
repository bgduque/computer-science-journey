/**
* Copyright © — New Era University and/or its affiliates. All rights reserved.
*
* @author Boris Gamaliel D. Duque
* @Note : There's no easy step, one must always venture a desolate path before arriving
*         on their rightful destination. Thus, making each and every one of us attain the
*         the goal that we have always longed for.
*
*/

package logic;

public class Employee {
    private String empNo, lastName, firstName;
    private double salary;

    public String getempNo() {
        return empNo;
    }

    public String getlastName() {
        return lastName;
    }

    public String getfirstName() {
        return firstName;
    }
    
    public double getSalary() {
        return salary;
    }

    /**
     * @param empNo          The Employee's Number e.g. E321
     */
    public void setempNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * @param lastName       The Employee's Last Name.
     */
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName      The Employee's First Name.
     */
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param salary         The Employee's corresponding salary
     * @implNote             This is an overloaded function, this one 
     *                       passes in a data type.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @param salary         The Employee's corresponding salary
     * @implNote             This is an overloaded function, this one 
     *                       passes in the Double Object Wrapper.
     *                       Which is wraps the value of primitive data type.
     * @see java.lang.Double
     */
    public void setSalary(Double salary) { 
        this.salary = salary;
    }
}
