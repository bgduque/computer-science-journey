package misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDA {
    private ArrayList<Course> courseLists = new ArrayList<Course>();
    private Integer totalUnits = 0;

    public CourseDA(String studentNo) throws FileNotFoundException {
        Scanner courseInfo = new Scanner(new FileReader("./data/scheduleInfo.csv"));

        while (courseInfo.hasNext()) {
            String rowCourse = courseInfo.nextLine();

            String[] specificCourseRow = new String[6];
            specificCourseRow = rowCourse.split(",");

            if (studentNo.equals(specificCourseRow[0])) {
                Course course = new Course();

                course.setCourseCode(specificCourseRow[1].trim());
                course.setDescription(specificCourseRow[2]);
                
                course.setUnit(Integer.parseInt(specificCourseRow[3].trim()));
                course.setDay(specificCourseRow[4].trim());
                course.setTime(specificCourseRow[5].trim());

                totalUnits += course.getUnit();

                courseLists.add(course);
            }
        }

        courseInfo.close();
    }

    public ArrayList<Course> getCourseLists() {
        return courseLists;
    }

    public Integer getTotalUnits() {
        return totalUnits;
    }

    public void setCourseLists(ArrayList<Course> courseLists) {
        this.courseLists = courseLists;
    }

    public void setTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
    }
    
}
