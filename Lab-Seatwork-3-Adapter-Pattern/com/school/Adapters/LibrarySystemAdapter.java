package com.school.Adapters;

import com.school.Adapters.Interface.SchoolManagementApp;
import com.school.SystemIntegrators.LibrarySystem;

public class LibrarySystemAdapter implements SchoolManagementApp{
    
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter (LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public String integrateSystem() {
        return librarySystem.manageBooks();
    }
}