package misc;

import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String name; 
    private String program;
    private Integer totalUnits;
    private ArrayList<Course> courses;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;    this.studentNumber = studentNumber;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        StringBuilder studentOpt = new StringBuilder();
        studentOpt.append("Student Number: ").append(studentNumber)
                  .append("\nName: ").append(name)
                  .append("\nProgram: ").append(program)
                  .append("\nTotal Units: ").append(totalUnits)
                  .append("\n\nCourse Code\tDescription\tUnit\tDay\tTime\n");

        for (Course course : courses) {
            studentOpt.append(course.toString());
        }
        return studentOpt.toString();
    }
}