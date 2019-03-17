package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> students;

    public Internship(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void setStudents(University university) {
        students.addAll(university.getHigherThanAverage());
    }

    public String getStudents() {
        return Arrays.toString(students.toArray());

    }
}