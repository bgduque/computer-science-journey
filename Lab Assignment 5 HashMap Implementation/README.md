# Lab Assignment 5 HashMap Implementation
<p>
  You are required to present a department report that accesses csv files. You must put the data on the domain composition of the objects.
</p>
<p>
  <img src="https://github.com/bgduque/computer-science-journey/blob/main/Lab%20Assignment%205%20HashMap%20Implementation/resource/Class%20Diagram.png">
  <br>
  <br>
dep.csv contains the following
  <br>
deptCode, deptName, location
  <br>
IT, Information Tech, 2nd floor
  <br>
HR, Human Resource, 3rd floor
  <br>
FNC, Finance, 4th floor
  <br>
  <br>
The deptemp.csv is referenced to get the salary  of the employees per department:
  <br>
deptCode, empNo, salary
  <br>
IT, E123, 30000
  <br>
IT, E124, 45000
  <br>
IT, E125, 51000
  <br>
HR, E251, 66000
  <br>
HR, E252, 25000
  <br>
FNC, E370, 42000
  <br>
FNC, E371, 29000
  <br>
FNC, E372, 37000
<br>
<br>
To get the details of the employee you must access the emp.csv:
<br>
empNo, lastName, firstName, job
  <br>
E123, Maxwell, John, Developer
  <br>
E124, Delos Reyes, Ernesto, Analyst
  <br>
E125, Ortiz, Manuel, Tester
  <br>
E251, Natividad, Lisa, HR Manager
  <br>
E252, Rosanto, Margareth, HR Specialist
  <br>
E370, Baldo, Jason, Team Leader
  <br>
E371, Hernandez, Timothy, Junior Accountant
  <br>
E372, Cruz, Ricardo, CPA
<br><br>
You need to create objects that will handle the retrieval of the csv files to convert it into objects.  These are EmployeeDA and EmployeeDA objects.  This will be the execution of the sequence:
  <br>
  <img src="https://github.com/bgduque/computer-science-journey/blob/main/Lab%20Assignment%205%20HashMap%20Implementation/resource/Sequence%20Diagram.png">
</p>

<p>
  <br>
This will be the sample generated report:
  <br>
Department code: IT
  <br>
Department name: Information Tech
  <br>
Department total salary: 126,000.00
  <br>
---------------------Details -------------------------
  <br>
EmpNo		 Employee Name	Salary
  <br>
E123		Maxwell, John			30,000.00
  <br>
E125		Ortiz, Manuel			51,000.00
  <br>
E124		Delos Reyes, Ernesto		45,000.00
  <br>
  <br>
Department code: HR
  <br>
Department name: Human Resource
  <br>
Department total salary: 91,000.00
  <br>
---------------------Details -------------------------
  <br>
EmpNo		 Employee Name	Salary
  <br>
E252		Rosanto, Margareth		25,000.00
  <br>
E251		Natividad, Lisa		66,000.00
  <br>
  <br>
Department code: FNC
  <br>
Department name: Finance
  <br>
Department total salary: 108,000.00
  <br>
---------------------Details -------------------------
  <br>
EmpNo		 Employee Name	Salary
  <br>
E370		Baldo, Jason			42,000.00
  <br>
E371		Hernandez, Timothy		29,000.00
  <br>
E372		Cruz, Ricardo			37,000.00
  <br>
  <br>
INSTRUCTIONS:
  <br>
  1. You are not allowed to alter the composition of the domain objects.  Stick to the design. Disregard the data in the csv if it is not necessary to the object.
  <br>
  2. Adhere to correct naming conventions in naming variables and objects.
  <br>
  3. Use hashmap as your solution to the problem.
  <br>
  4. Use the department.setDepTotalSalary() in putting the aggregated value into the object.  Do not just use the salary accumulation approach in the printing process to get the depTotalSalary.
  <br>
  5. Submit the Github solution link provided in NEUVLE.
  <br>
</p>
