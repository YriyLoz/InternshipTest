package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getHigherThanAverage() {
        int averageLevel = getAverageLevel();
        List<Student> HigherThanAverage = new ArrayList<>();
        for (Student student : students) {

            if (student.getKnowledge().getLevel() > averageLevel) {

                HigherThanAverage.add(student);
            }
        }
        return HigherThanAverage;
    }


    private int getAverageLevel() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getKnowledge().getLevel();
        }
        return sum / students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
