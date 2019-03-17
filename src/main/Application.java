package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 3));
        university.addStudent(new Student("Julia Veselkina", 4));
        university.addStudent(new Student("Maria Perechrest", 8));
        Internship internship = new Internship("Interlink");

        internship.setStudents(university); //Because can be more than one university

        University university2 = new University("BL.E.T");
        university2.addStudent(new Student("Igor Veselkina", 3));
        university2.addStudent(new Student("Julia Kostenko", 10));
        university2.addStudent(new Student("Maria Ivanova", 8));

        internship.setStudents(university2);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());

    }
}
