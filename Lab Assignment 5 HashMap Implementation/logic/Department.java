/**
* Copyright © — New Era University and/or its affiliates. All rights reserved.
*
* @author Boris Gamaliel D. Duque
* @Note : There's no easy step, one must always venture a desolate path before arriving
*         on their rightful destination. Thus, making each and every one of us attain the
*         the goal that we have always longed for.
*/
package logic;

public class Department {
    private String depCode, depName;
    private double depTotalSalary;
    
    public String getDepCode() {
        return depCode;
    }

    public String getDepName() {
        return depName;
    }

    public double getDepTotalSalary() {
        return depTotalSalary;
    }

    /**
     * @param depCode                The department code value(s).
     */
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    /**
     * @param depName                The department name value(s).
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @param depTotalSalaryEach     Department(s) total calculated salary when passed in the added salary of their corresponding employees.
     * @implNote                     Overloaded {@function setDepTotalSalary} This one passes a primitive data type. Instead of a wrapper object.
     */
    public void setDepTotalSalary(double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }

    /**
     * @param depTotalSalary         Department(s) total calculated salary when passed in the added salary of their corresponding employees.
     * @implNote                     Overloaded {@function setDepTotalSalary} This one passes a Double Object Wrapper.
     *                               What does this do is wraps the primitive data type.
     * @see java.lang.Double
     */
    public void setDepTotalSalary(Double depTotalSalary) { 
        this.depTotalSalary = depTotalSalary;
    }

}
