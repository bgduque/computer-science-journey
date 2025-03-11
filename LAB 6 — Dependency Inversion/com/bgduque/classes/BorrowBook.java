package com.bgduque.classes;

import com.bgduque.interfaces.Library;

public class BorrowBook implements Library{
    @Override
    public void borrow(String title){
        System.out.println("Borrowing book: " + title);
    }
}
