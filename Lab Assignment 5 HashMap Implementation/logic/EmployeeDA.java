/**
* Copyright © — New Era University and/or its affiliates. All rights reserved.
*
* @author Boris Gamaliel D. Duque
* @Note : There's no easy step, one must always venture a desolate path before arriving
*         on their rightful destination. Thus, making each and every one of us attain the
*         the goal that we have always longed for.
*
* @INFORMATION : EmployeeDA — Employee Data Access. Here is where the information about
*                our employees are stored. It is then read, inputted on our HashMap.
*                
*                @param <K>             Key - Our key is an Object String.
*                @param <V>             Value — Employee Object as it is where our value
*                                               we stored our value data.
*/

package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class EmployeeDA {
    private final static String[] employeeInfoFilePath = { "./data/emp.csv" };
    private HashMap<String, Employee> employeeMap = new HashMap<>();
    
    public HashMap<String, Employee> employeeReader() {
        try (BufferedReader r = new BufferedReader(new FileReader(employeeInfoFilePath[0]))) {
            r.readLine();
            String x;
            while ((x = r.readLine()) != null) {
                String[] data = x.split(",");
                Employee e = new Employee();
                e.setempNo(data[0].trim());
                e.setlastName(data[1].trim());
                e.setfirstName(data[2].trim());
                employeeMap.put(e.getempNo(), e);
            }
        } catch (FileNotFoundException e){
            for(int i = 0; i < employeeInfoFilePath.length; i++){
                System.out.printf("File(s): %-10s not found!\n", employeeInfoFilePath[i].trim());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return employeeMap;
    }
}
