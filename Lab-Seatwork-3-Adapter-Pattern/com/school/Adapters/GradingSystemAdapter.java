package com.school.Adapters;

import com.school.Adapters.Interface.SchoolManagementApp;
import com.school.SystemIntegrators.GradingSystem;

public class GradingSystemAdapter implements SchoolManagementApp {

    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public String integrateSystem() {
        return gradingSystem.markGrades();
    }
    
}
