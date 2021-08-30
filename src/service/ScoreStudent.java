package service;

import writeReadFile.*;
import model.*;
import model.Subject;

import java.lang.Math;
import java.util.List;
import java.util.Scanner;

public class ScoreStudent {
    private static final Scanner sc = new Scanner(System.in);
    static List<Subject> mathList, chemistryList, biologyList, physicList;

    public static void addMathScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        mathList = MathWRFile.readFileMath();
        List<Student> studentList = StudentManager.studentsList;

        for (int i = 0; i < studentList.size(); i++) {
            int stt = (mathList.size() > 0) ? (mathList.size() + 1) : 1;
            if (studentList.get(i).getStt() == stt) {
                System.out.println("Stt " + stt);
                String name = studentList.get(i).getName();
                System.out.println("Tên " + name);

                double ktBaiCu = inputKtBaiCu();
                double kt15p = inputKt15p();
                double kt45p = inputKt45p();
                double kthk = inputKthk();
                double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                Subject math = new Subject(stt, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                mathList.add(math);
                MathWRFile.writeFileMath(mathList);

                for (Student student : studentList) {
                    if (student.getStt() == stt) {
                        student.setMathScore(gpa);
                    }
                }
                StudentWRFile.writeFile(studentList);
            }
        }
    }

    public static void addChemistryScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        chemistryList = ChemistryWRFile.readFileChemistry();
        List<Student> studentList = StudentManager.studentsList;
        for (int i = 0; i < studentList.size(); i++) {
            int stt = (chemistryList.size() > 0) ? (chemistryList.size() + 1) : 1;
            if (studentList.get(i).getStt() == stt) {
                System.out.println("Stt " + stt);
                String name = studentList.get(i).getName();
                System.out.println("Tên " + name);

                double ktBaiCu = inputKtBaiCu();
                double kt15p = inputKt15p();
                double kt45p = inputKt45p();
                double kthk = inputKthk();
                double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                Subject chemistry = new Subject(stt, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                chemistryList.add(chemistry);
                ChemistryWRFile.writeFileChemistry(chemistryList);
                for (Student student : studentList) {
                    if (student.getStt() == stt) {
                        student.setChemistryScore(gpa);
                    }
                }
                StudentWRFile.writeFile(studentList);
            }
        }
    }

    public static void addBiologyScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        biologyList = BiologyWRFile.readFileBiology();
        List<Student> studentList = StudentManager.studentsList;
        for (int i = 0; i < studentList.size(); i++) {
            int stt = (biologyList.size() > 0) ? (biologyList.size() + 1) : 1;
            if (studentList.get(i).getStt() == stt) {
                System.out.println("Stt " + stt);
                String name = studentList.get(i).getName();
                System.out.println("Tên " + name);

                double ktBaiCu = inputKtBaiCu();
                double kt15p = inputKt15p();
                double kt45p = inputKt45p();
                double kthk = inputKthk();
                double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                Subject biogoly = new Subject(stt, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                biologyList.add(biogoly);
                BiologyWRFile.writeFileBiology(biologyList);
                for (Student student : studentList) {
                    if (student.getStt() == stt) {
                        student.setBiologyScore(gpa);
                    }
                }
                StudentWRFile.writeFile(studentList);
            }
        }
    }

    public static void addPhysicScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        physicList = PhysicWRFile.readFilePhysic();
        List<Student> studentList = StudentManager.studentsList;
        for (int i = 0; i < studentList.size(); i++) {
            int stt = (physicList.size() > 0) ? (physicList.size() + 1) : 1;
            if (studentList.get(i).getStt() == stt) {
                System.out.println("Stt " + stt);
                String name = studentList.get(i).getName();
                System.out.println("Tên " + name);

                double ktBaiCu = inputKtBaiCu();
                double kt15p = inputKt15p();
                double kt45p = inputKt45p();
                double kthk = inputKthk();
                double gpa = Math.round(((ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7) * 100.0) / 100.0;
                Subject physic = new Subject(stt, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                physicList.add(physic);
                PhysicWRFile.writeFilePhysic(physicList);
                for (Student student : studentList) {
                    if (student.getStt() == stt) {
                        student.setPhysicScore(gpa);
                    }
                }
                StudentWRFile.writeFile(studentList);
            }
        }
    }

    public static double inputKtBaiCu() {
        double ktBaiCu;
        System.out.print("Nhập điểm kiểm tra bài cũ: ");
        while (true) {
            try {
                ktBaiCu = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
                System.out.print("Nhập lại điểm: ");
            }
        }
        return ktBaiCu;
    }

    public static double inputKt15p() {
        double kt15p;
        System.out.print("Nhập điểm kiểm tra 15 phút: ");
        while (true) {
            try {
                kt15p = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
                System.out.print("Nhập lại điểm: ");
            }
        }
        return kt15p;
    }

    public static double inputKt45p() {
        double kt45p;
        System.out.print("Nhập điểm kiểm tra 45 phút: ");
        while (true) {
            try {
                kt45p = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
                System.out.print("Nhập lại điểm: ");
            }
        }
        return kt45p;
    }

    public static double inputKthk() {
        double kthk;
        System.out.print("Nhập điểm kiểm tra học kì: ");
        while (true) {
            try {
                kthk = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
                System.out.print("Nhập lại điểm: ");
            }
        }
        return kthk;
    }
}
