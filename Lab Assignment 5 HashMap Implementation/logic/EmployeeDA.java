package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class EmployeeDA {
    private final static String[] employeeInfoFilePath = { "./data/emp.csv" };
    
    public HashMap<String, Employee> employeeReader(){
        HashMap<String, Employee> employeeMap = new HashMap<>();
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
                System.out.printf("File(s) %s not found!", employeeInfoFilePath[i], " , ");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return employeeMap;
    }

    public String toString() {
        DepartmentDA dDA = new DepartmentDA();
        Map<String, Department> departmentMap = dDA.readDepEmp();
        Department d = new Department();
        StringBuilder sb = new StringBuilder();
        sb.append(d.getDepCode());
        return sb.toString();
    }
}