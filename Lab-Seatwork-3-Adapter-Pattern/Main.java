import com.school.Adapters.AttendanceSystemAdapter;
import com.school.Adapters.GradingSystemAdapter;
import com.school.Adapters.LibrarySystemAdapter;
import com.school.SystemIntegrators.AttendanceSystem;
import com.school.SystemIntegrators.GradingSystem;
import com.school.SystemIntegrators.LibrarySystem;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to New Era's Unified School Management Application\n");
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        AttendanceSystemAdapter attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        GradingSystemAdapter gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        LibrarySystemAdapter librarySystemAdapter = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendanceSystemAdapter.integrateSystem());
        System.out.println(gradingSystemAdapter.integrateSystem());
        System.out.println(librarySystemAdapter.integrateSystem());
        
        
    }
    
}
