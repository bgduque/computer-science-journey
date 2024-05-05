package com.bgduque.classes;

import com.bgduque.interfaces.Library;

public class BorrowJournal implements Library{
    @Override
    public void borrow(String title){
        System.out.println("Borrowing journal: " + title);
    }
}