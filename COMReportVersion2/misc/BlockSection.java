package misc;

import java.util.ArrayList;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private Integer totalStudents;
    private ArrayList<Student> students;

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public Integer getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(Integer totalStudents) {
        this.totalStudents = totalStudents;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder blockOpt = new StringBuilder();
        blockOpt.append("Block Section Code: ").append(blockCode)
                .append("\nDescription: ").append(description)
                .append("\nAdviser: ").append(adviser)
                .append("\nTotal Students: ").append(totalStudents);

        for (Student student : students) {
            blockOpt.append(student.toString());
        }
        return blockOpt.toString();
    }
    
}
