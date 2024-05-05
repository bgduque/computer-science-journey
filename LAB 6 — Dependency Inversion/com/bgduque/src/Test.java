package com.bgduque.src;

import com.bgduque.classes.BorrowBook;
import com.bgduque.classes.BorrowJournal;
import com.bgduque.classes.JournalProcess;
import com.bgduque.classes.Student;
import com.bgduque.classes.Process;


public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("543", "Fermine", "Chapeo", "Goblet of Fire — 2000");
        Process process1 = new Process(student1, new BorrowBook());
        process1.processBook();
    
        Student student2 = new Student("321", "Guada", "Ipariem", "Deathly Hallows — 2007");
        Process process2 = new Process(student2, new BorrowBook());
        process2.processBook();
    
        Student student3 = new Student("678", "Calleope", "Yuña", "The Bell Jar — 1963");
        JournalProcess process3 = new JournalProcess(student3, new BorrowJournal());
        process3.processJournal();
    
        Student student4 = new Student("891", "Xythoze", "Yamazisy", "Half-Blood Prince — 2005");
        JournalProcess process4 = new JournalProcess(student4, new BorrowJournal());
        process4.processJournal();
    }
}
