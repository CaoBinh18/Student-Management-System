package service;

import WriteReadFile.*;
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
        mathList = MathWRFile.readFileMath();
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("Stt học viên: ");
        try {
            int stt = Integer.parseInt((sc.nextLine()));
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStt() == stt) {
                    int stt1 = studentList.get(i).getStt();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject math = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    mathList.get(i).setKtBaiCu(math.getKtBaiCu());
                    mathList.get(i).setKt15p(math.getKt15p());
                    mathList.get(i).setKt45p(math.getKt45p());
                    mathList.get(i).setKthk(math.getKthk());
                    mathList.get(i).setGpa(math.getGpa());
                    MathWRFile.writeFileMath(mathList);

                    for (Student student : studentList) {
                        if (student.getStt() == stt) {
                            student.setMathScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        MathWRFile.writeFileMath(mathList);
    }

    public static void editChemistryScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        chemistryList = ChemistryWRFile.readFileChemistry();
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("Stt học viên: ");
        try {
            int stt = Integer.parseInt((sc.nextLine()));
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStt() == stt) {
                    int stt1 = studentList.get(i).getStt();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject chemistry = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    chemistryList.get(i).setKtBaiCu(chemistry.getKtBaiCu());
                    chemistryList.get(i).setKt15p(chemistry.getKt15p());
                    chemistryList.get(i).setKt45p(chemistry.getKt45p());
                    chemistryList.get(i).setKthk(chemistry.getKthk());
                    chemistryList.get(i).setGpa(chemistry.getGpa());

                    ChemistryWRFile.writeFileChemistry(chemistryList);

                    for (Student student : studentList) {
                        if (student.getStt() == stt) {
                            student.setChemistryScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
//        MathWRFile.writeFileMath(mathList);
    }

    public static void editBiologyScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        biologyList = BiologyWRFile.readFileBiology();
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("Stt học viên: ");
        try {
            int stt = Integer.parseInt((sc.nextLine()));
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStt() == stt) {
                    int stt1 = studentList.get(i).getStt();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject subject = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk);
                    biologyList.get(i).setKtBaiCu(subject.getKtBaiCu());
                    biologyList.get(i).setKt15p(subject.getKt15p());
                    biologyList.get(i).setKt45p(subject.getKt45p());
                    biologyList.get(i).setKthk(subject.getKthk());
                    biologyList.get(i).setGpa(subject.getGpa());
                    BiologyWRFile.writeFileBiology(biologyList);
                    for (Student student : studentList) {
                        if (student.getStt() == stt) {
                            student.setBiologyScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
//        MathWRFile.writeFileMath(mathList);
    }

    public static void editPhysicScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        physicList = PhysicWRFile.readFilePhysic();
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("Stt học viên: ");
        try {
            int stt = Integer.parseInt((sc.nextLine()));
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStt() == stt) {
                    int stt1 = studentList.get(i).getStt();
                    String name = studentList.get(i).getName();
                    double ktBaiCu = ScoreStudent.inputKtBaiCu();
                    double kt15p = ScoreStudent.inputKt15p();
                    double kt45p = ScoreStudent.inputKt45p();
                    double kthk = ScoreStudent.inputKthk();
                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;

                    Subject subject = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    physicList.get(i).setKtBaiCu(subject.getKtBaiCu());
                    physicList.get(i).setKt15p(subject.getKt15p());
                    physicList.get(i).setKt45p(subject.getKt45p());
                    physicList.get(i).setKthk(subject.getKthk());
                    physicList.get(i).setGpa(subject.getGpa());

                    PhysicWRFile.writeFilePhysic(physicList);
                    for (Student student : studentList) {
                        if (student.getStt() == stt) {
                            student.setPhysicScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        PhysicWRFile.writeFilePhysic(physicList);
    }
}
