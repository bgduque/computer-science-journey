/**
* Copyright © — New Era University and/or its affiliates. All rights reserved.
*
* @author Boris Gamaliel D. Duque
* @Note : There's no easy step, one must always venture a desolate path before arriving
*         on their rightful destination. Thus, making each and every one of us attain the
*         the goal that we have always longed for.
*/
package logic;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


public class DepartmentDA {
    private final static String[] departmentInfoFilePath = { "./data/dep.csv", "./data/deptemp.csv" };
    
    private EmployeeDA eDA = new EmployeeDA();

    private HashMap<String, Employee> employeeMap = eDA.employeeReader();
    private HashMap<String, Department> departmentMap = new HashMap<>();
    private HashMap<String, List<Employee>> depEmpMap = new HashMap<>();

    private HashMap<String, Double> uniqueEmployeeSalaries = new HashMap<>();
    private HashMap<String, Department> depMap = readDepEmp();

    public HashMap<String, Department> readDepEmp() {

        try (BufferedReader xR = new BufferedReader(new FileReader(departmentInfoFilePath[1]));
        BufferedReader yR = new BufferedReader(new FileReader(departmentInfoFilePath[0]))){
        
            xR.readLine();
            String x;
            while((x = xR.readLine()) != null) { 
                String[] data = x.split(",");
                
                Department d = departmentMap.get(data[0].trim());
                
                if(d == null) {
                    d = new Department();
                    d.setDepCode(data[0].trim());
                    departmentMap.put(d.getDepCode(), d);
                }
                
                Employee e = employeeMap.get(data[1].trim());
                if(e == null) {
                    e = new Employee();
                    e.setempNo(data[1].trim());
                    employeeMap.put(e.getempNo(), e);
                }
                
                e.setSalary(Double.parseDouble(data[2].trim()));

                List<Employee> empsInDept = depEmpMap.getOrDefault(d.getDepCode(), new ArrayList<>());
                empsInDept.add(e);
                depEmpMap.put(d.getDepCode(), empsInDept);
            }

            for (HashMap.Entry<String, List<Employee>> entry : depEmpMap.entrySet()) {
                String depCode = entry.getKey();
                List<Employee> employees = entry.getValue();
                for (Employee e : employees) {
                    String uniqueKey = depCode + "-" + e.getempNo();
            
                    uniqueEmployeeSalaries.putIfAbsent(uniqueKey, e.getSalary());
                }
            }
            
            for (HashMap.Entry<String, Department> entry : departmentMap.entrySet()) {
                String depCode = entry.getKey();
                Department d = entry.getValue();
            
                double totalSalary = 0.0;
                for (HashMap.Entry<String, Double> salaryEntry : uniqueEmployeeSalaries.entrySet()) {
                    if (salaryEntry.getKey().startsWith(depCode + "-")) {
                        totalSalary += salaryEntry.getValue();
                    }
                }
            
                d.setDepTotalSalary(totalSalary);
            }
            yR.readLine();
            String y;
            while ((y = yR.readLine()) != null) {
                String[] data = y.split(",");
                Department d = departmentMap.get(data[0].trim());
                if(d != null) {
                    d.setDepName(data[1].trim());
                }
            }

        } catch (FileNotFoundException e) {
            for(int i = 0; i< departmentInfoFilePath.length; i++){
                System.out.printf("File(s): %-10s not found!\n", departmentInfoFilePath[i].trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return departmentMap;
    }
    
    public HashMap<String, List<Employee>> readDepartmentEmployeeAsMap() {
        readDepEmp();
        return readDepartmentEmployeeAsMap();
    }

    /**
     * @return toString();  
     */
    
    public String toString() { 
        StringBuilder sb = new StringBuilder();
        DecimalFormat dF = new DecimalFormat("#,###.00");
        for(Department d : depMap.values()) {
            sb.append("\n");
            String departmentInfortation = String.format(
            "Department code: %s\nDepartment name: %s\nDepartment total salary: %s\n", 
                    d.getDepCode(), 
                    d.getDepName(), 
                    dF.format(d.getDepTotalSalary())
                    );
            sb.append(departmentInfortation);
            sb.append("---------------------Details-------------------------\n");
            sb.append("EmpNo\tEmployee Name\t\tSalary\n");
            for(Employee e : depEmpMap.get(d.getDepCode())) {
                String employeeInformation = String.format(
                    "%-5s\t%-20s\t%2s\n", 
                            e.getempNo(), 
                            e.getlastName() + " , " +e.getfirstName(),
                            dF.format(e.getSalary())
                            );
                    sb.append(employeeInformation);
            }
        }
        return sb.toString();
    }

    public String printData() {
        System.out.println(toString());
        return toString();
    }
}
