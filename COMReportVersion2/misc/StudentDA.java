package misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDA {
    private ArrayList<Student> studentLists = new ArrayList<Student>();
    private Integer totalStudents = 0;

    public StudentDA(String blockCode) throws FileNotFoundException {
        Scanner studInfo = new Scanner(new FileReader("./data/studentInfo.csv"));

        while(studInfo.hasNext()) {
            String rowStudent = studInfo.nextLine();

            String[] specificStudentRow = new String[4];
            specificStudentRow = rowStudent.split(",");

            if (blockCode.equals(specificStudentRow[0].trim())) {
                Student student = new Student();

                student.setStudentNumber(specificStudentRow[1].trim());
                student.setName(specificStudentRow[2].trim());
                student.setProgram(specificStudentRow[3].trim());

                ++totalStudents;

                CourseDA courseDA = new CourseDA(student.getStudentNumber());

                student.setCourses(courseDA.getCourseLists());
                student.setTotalUnits(courseDA.getTotalUnits());

                studentLists.add(student);
            }
        }
        studInfo.close();
    }

    public ArrayList<Student> getStudentLists() {
        return studentLists;
    }

    public Integer getTotalStudents() {
        return totalStudents;
    }
}
