package com.bgduque.classes;

public class Process {
    private Student student;
    private BorrowBook borrowBook;

    public Process(Student student, BorrowBook borrowBook) {
        this.student = student;
        this.borrowBook = borrowBook;
    }

    public void processBook() {
        borrowBook.borrow(student.getTitle());
    }
}
