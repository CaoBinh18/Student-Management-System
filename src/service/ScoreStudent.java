package service;

import writeReadFile.*;
import model.*;
import model.Subject;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static service.Regex.checkScoreStudent;
import static service.Regex.convertInt;

public class ScoreStudent {
    private static final Scanner sc = new Scanner(System.in);
    static List<Subject> mathList, chemistryList, biologyList, physicList;

    public static void addMathScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        mathList = SubjectWRFile.readFileSubject("Maths.csv");
        List<Student> studentList = StudentManager.studentsList;

        int choice;
        double ktBaiCu=0, kt15p=0, kt45p=0, kthk = 0;
        System.out.print("Nhập ID học sinh: ");
        try {
            long id = Long.parseLong(sc.nextLine());

            for (Student student : studentList) {
                if (student.getId() == id) {
                    System.out.println("Id " + id);
                    String name = student.getName();
                    System.out.println("Tên " + name);
                    do {
                        Menu.menuAddScore();
                        while (true) {
                            try {
                                choice = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Nhập sai");
                            }
                        }

                        switch (choice) {
                            case 1:
                                ktBaiCu = inputKtBaiCu();
                                break;
                            case 2:
                                kt15p = inputKt15p();
                                break;
                            case 3:
                                kt45p = inputKt45p();
                                break;
                            case 4:
                                kthk = inputKthk();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai!");
                                System.out.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice != 0);

                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject math = new Subject(id, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    mathList.add(math);
                    SubjectWRFile.writeFileSubject(mathList, "Maths.csv");

                    for (Student student1 : studentList) {
                        if (student1.getId() == id) {
                            student1.setMathScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public static void addChemistryScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");
        List<Student> studentList = StudentManager.studentsList;

        int choice;
        double ktBaiCu=0, kt15p=0, kt45p=0, kthk = 0;
        System.out.print("Nhập ID học sinh: ");
        try {
            long id = Long.parseLong(sc.nextLine());

            for (Student student : studentList) {
                if (student.getId() == id) {
                    System.out.println("Id " + id);
                    String name = student.getName();
                    System.out.println("Tên " + name);
                    do {
                        Menu.menuAddScore();
                        while (true) {
                            try {
                                choice = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Nhập sai");
                            }
                        }

                        switch (choice) {
                            case 1:
                                ktBaiCu = inputKtBaiCu();
                                break;
                            case 2:
                                kt15p = inputKt15p();
                                break;
                            case 3:
                                kt45p = inputKt45p();
                                break;
                            case 4:
                                kthk = inputKthk();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai!");
                                System.out.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice != 0);

                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject chemistry = new Subject(id, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    chemistryList.add(chemistry);
                    SubjectWRFile.writeFileSubject(chemistryList, "Chemistrys.csv");

                    for (Student student1 : studentList) {
                        if (student1.getId() == id) {
                            student1.setChemistryScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void addBiologyScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        biologyList = SubjectWRFile.readFileSubject("Biology.csv");
        List<Student> studentList = StudentManager.studentsList;

        int choice;
        double ktBaiCu=0, kt15p=0, kt45p=0, kthk = 0;
        System.out.print("Nhập ID học sinh: ");
        try {
            long id = Long.parseLong(sc.nextLine().trim());

            for (Student student : studentList) {
                if (student.getId() == id) {
                    System.out.println("Id " + id);
                    String name = student.getName();
                    System.out.println("Tên " + name);
                    do {
                        Menu.menuAddScore();
                        while (true) {
                            try {
                                choice = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Nhập sai");
                            }
                        }

                        switch (choice) {
                            case 1:
                                ktBaiCu = inputKtBaiCu();
                                break;
                            case 2:
                                kt15p = inputKt15p();
                                break;
                            case 3:
                                kt45p = inputKt45p();
                                break;
                            case 4:
                                kthk = inputKthk();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai!");
                                System.out.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice != 0);

                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject biogoly = new Subject(id, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    biologyList.add(biogoly);
                    SubjectWRFile.writeFileSubject(biologyList, "Biology.csv");

                    for (Student student1 : studentList) {
                        if (student1.getId() == id) {
                            student1.setBiologyScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void addPhysicScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        physicList = SubjectWRFile.readFileSubject("Physic.csv");
        List<Student> studentList = StudentManager.studentsList;

        int choice;
        double ktBaiCu=0, kt15p=0, kt45p=0, kthk = 0;

        System.out.print("Nhập ID học sinh: ");
        try {
            long id = Long.parseLong(sc.nextLine());

            for (Student student : studentList) {
                if (student.getId() == id) {
                    System.out.println("Id " + id);
                    String name = student.getName();
                    System.out.println("Tên " + name);
                    do {
                        Menu.menuAddScore();
                        while (true) {
                            try {
                                choice = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Nhập sai");
                            }
                        }

                        switch (choice) {
                            case 1:
                                ktBaiCu = inputKtBaiCu();
                                break;
                            case 2:
                                kt15p = inputKt15p();
                                break;
                            case 3:
                                kt45p = inputKt45p();
                                break;
                            case 4:
                                kthk = inputKthk();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai!");
                                System.out.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice != 0);

                    double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                    Subject physic = new Subject(id, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    physicList.add(physic);
                    SubjectWRFile.writeFileSubject(physicList, "Physic.csv");
                    for (Student student1 : studentList) {
                        if (student1.getId() == id) {
                            student1.setPhysicScore(gpa);
                        }
                    }
                    StudentWRFile.writeFile(studentList);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static double inputKtBaiCu() {
        System.out.print("Nhập điểm kiểm tra bài cũ: ");
        String ktBaiCu = sc.nextLine();
        while (!checkScoreStudent(ktBaiCu)) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
            System.out.print("Nhập lại điểm: ");
            ktBaiCu = sc.nextLine();
        }
        convertInt(ktBaiCu);
        return Double.parseDouble(ktBaiCu);
    }

    public static double inputKt15p() {
        System.out.print("Nhập điểm kiểm tra 15 phút: ");
        String kt15p = sc.nextLine();
        while (!checkScoreStudent(kt15p)) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
            System.out.print("Nhập lại điểm: ");
            kt15p = sc.nextLine();
        }
        convertInt(kt15p);
        return Double.parseDouble(kt15p);
    }

    public static double inputKt45p() {
        System.out.print("Nhập điểm kiểm tra 45 phút: ");
        String kt45p = sc.nextLine();
        while (!checkScoreStudent(kt45p)) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
            System.out.print("Nhập lại điểm: ");
            kt45p = sc.nextLine();
        }
        convertInt(kt45p);
        return Double.parseDouble(kt45p);
    }

    public static double inputKthk() {
        System.out.print("Nhập điểm kiểm tra học kì: ");
        String kthk = sc.nextLine();
        while (!checkScoreStudent(kthk)) {
            System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
            System.out.print("Nhập lại điểm: ");
            kthk = sc.nextLine();
        }
        convertInt(kthk);
        return Double.parseDouble(kthk);
    }
}
