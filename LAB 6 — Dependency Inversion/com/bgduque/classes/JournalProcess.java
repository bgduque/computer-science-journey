package com.bgduque.classes;

public class JournalProcess {
    private Student student;
    private BorrowJournal borrowJournal;

    public JournalProcess(Student student, BorrowJournal borrowJournal) {
        this.student = student;
        this.borrowJournal = borrowJournal;
    }
    
    public void processJournal() {
        borrowJournal.borrow(student.getTitle());
    }
}
