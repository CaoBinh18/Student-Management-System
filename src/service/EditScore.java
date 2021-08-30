package service;

import writeReadFile.*;
import model.Student;
import model.Subject;

import java.util.List;
import java.util.Scanner;


public class EditScore {
    private static final Scanner sc = new Scanner(System.in);
    static List<Subject> mathList;
    static List<Subject> chemistryList;
    static List<Subject> biologyList;
    static List<Subject> physicList;

    public static void editMathScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        mathList = SubjectWRFile.readFileSubject( "Maths.csv");
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("Id học viên: ");
        try {
            long id = Long.parseLong(sc.nextLine());
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId() == id) {
                    long id1 = studentList.get(i).getId();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;

                    Subject math = new Subject(id1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    mathList.get(i).setKtBaiCu(math.getKtBaiCu());
                    mathList.get(i).setKt15p(math.getKt15p());
                    mathList.get(i).setKt45p(math.getKt45p());
                    mathList.get(i).setKthk(math.getKthk());
                    mathList.get(i).setGpa(math.getGpa());
                    SubjectWRFile.writeFileSubject(mathList,"Maths.csv");


                    for (Student student : studentList) {
                        if (student.getId() == id) {
                            student.setMathScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        SubjectWRFile.writeFileSubject(mathList,"Maths.csv");
    }

    public static void editChemistryScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("id học viên: ");
        try {
            long id = Long.parseLong(sc.nextLine());
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId() == id) {
                    long id1 = studentList.get(i).getId();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject chemistry = new Subject(id1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    chemistryList.get(i).setKtBaiCu(chemistry.getKtBaiCu());
                    chemistryList.get(i).setKt15p(chemistry.getKt15p());
                    chemistryList.get(i).setKt45p(chemistry.getKt45p());
                    chemistryList.get(i).setKthk(chemistry.getKthk());
                    chemistryList.get(i).setGpa(chemistry.getGpa());

                    chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");

                    for (Student student : studentList) {
                        if (student.getId() == id) {
                            student.setChemistryScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
    }

    public static void editBiologyScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        biologyList = SubjectWRFile.readFileSubject("Biology.csv");
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("id học viên: ");
        try {
            long id = Long.parseLong(sc.nextLine());
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId() == id) {
                    long id1 = studentList.get(i).getId();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject subject = new Subject(id1, name, ktBaiCu, kt15p, kt45p, kthk);
                    biologyList.get(i).setKtBaiCu(subject.getKtBaiCu());
                    biologyList.get(i).setKt15p(subject.getKt15p());
                    biologyList.get(i).setKt45p(subject.getKt45p());
                    biologyList.get(i).setKthk(subject.getKthk());
                    biologyList.get(i).setGpa(subject.getGpa());
                    physicList = SubjectWRFile.readFileSubject("Physic.csv");

                    for (Student student : studentList) {
                        if (student.getId() == id) {
                            student.setBiologyScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
    }

    public static void editPhysicScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        SubjectWRFile.writeFileSubject(physicList,"Physic.csv");
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("id học viên: ");
        try {
            long id = Long.parseLong(sc.nextLine());
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId() == id) {
                    long id1 = studentList.get(i).getId();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;

                    Subject subject = new Subject(id1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    physicList.get(i).setKtBaiCu(subject.getKtBaiCu());
                    physicList.get(i).setKt15p(subject.getKt15p());
                    physicList.get(i).setKt45p(subject.getKt45p());
                    physicList.get(i).setKthk(subject.getKthk());
                    physicList.get(i).setGpa(subject.getGpa());

                    SubjectWRFile.writeFileSubject(physicList,"Physic.csv");

                    for (Student student : studentList) {
                        if (student.getId() == id) {
                            student.setPhysicScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        SubjectWRFile.writeFileSubject(physicList,"Physic.csv");

    }
}
