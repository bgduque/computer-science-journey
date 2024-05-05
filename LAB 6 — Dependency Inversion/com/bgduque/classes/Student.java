package com.bgduque.classes;

public class Student {
    private String studentNumber, lastName, firstName, title;
    
    public Student(String studentNumber, String lastName, String firstName, String title) {
        this.studentNumber = studentNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
    }

    public String getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
