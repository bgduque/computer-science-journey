package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class DepartmentDA {
    private final static String[] departmentInfoFilePath = { "./data/dep.csv", "./data/deptemp.csv" };
    private EmployeeDA eDA = new EmployeeDA();
    
    public HashMap<String, Department> readDepEmp() {
        HashMap<String, Department> departmentMap = new HashMap<>();
        HashMap<String, Employee> employeeMap = eDA.employeeReader();

        try (BufferedReader xR = new BufferedReader(new FileReader(departmentInfoFilePath[1]));
             BufferedReader yR = new BufferedReader(new FileReader(departmentInfoFilePath[0]))) {
            
            xR.readLine();
            yR.readLine();

            String x;
            String y;

            while((x = xR.readLine()) != null) { 
                String[] data = x.split(",");
                Department d = departmentMap.get(data[0].trim());
                d = new Department();
                d.setDepCode(data[0].trim());
                departmentMap.put(d.getDepCode(), d);
            }
            
            while ((y = yR.readLine()) != null) {
                String[] data = y.split(",");
                Department d = departmentMap.get(data[0].trim());
                d.setDepName(data[1].trim());
                departmentMap.put(d.getDepName(), d);
            }
            
        } catch (FileNotFoundException e) {
            for(int i = 0; i< departmentInfoFilePath.length; i++){
                System.out.printf("File %s not found!", departmentInfoFilePath[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return departmentMap;
    }

    public String toString() { 
        HashMap<String, Department> dMap = readDepEmp();
        StringBuilder sb = new StringBuilder();
        sb.append("Department Information: ");
        return sb.toString();
    }

}

/*
* Copyright © — https://github.com/bgduque : Boris Gamaliel D. Duque
* 
* 
* Below this documentation are codes that are usable but not entirely efficient.
* Most of the block(s) are returning either O(n) or O(n²).
* 
* Take note: These are mostly O(1) being due to the fact that the csv's as data aren't
* changing/changed since the last update of the code.
* 
* However, I can assure you that you can play with the data, by putting yours in.
* 
* 
*/

// ---------------- Employee Salary --------------------
// Employee e = employeeMap.get(data[1].trim());
// double salary = Double.parseDouble(data[2].trim());
// if (e != null) {
//     e.setsalary(salary);
//     e.setempNo(data[1].trim());

//     System.out.printf("\n%-5s %.2f", e.getempNo(), salary);
//     }
// }
/*
 * Scrapped this is returning null as if it is passed in a print statement
 * inside a fn.
 */
