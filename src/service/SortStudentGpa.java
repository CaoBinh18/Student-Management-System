package service;

import model.Student;

import java.util.Comparator;

public class SortStudentGpa implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGpa1() > student2.getGpa1()) {
            return 1;
        }
        return -1;
    }
}
