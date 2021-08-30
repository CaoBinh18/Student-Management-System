package service;

import model.Student;

import java.util.Comparator;

public class SortStudentName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
