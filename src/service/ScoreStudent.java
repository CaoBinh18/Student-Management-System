package service;

import WriteReadFile.ChemistryWRFile;
import WriteReadFile.MathWRFile;
import WriteReadFile.StudentWRFile;
import model.*;
import model.Subject;

import java.util.List;
import java.util.Scanner;

public class ScoreStudent {
    private static final Scanner sc = new Scanner(System.in);
    static List<Subject> mathList;
    static List<Subject> chemistryList;
    static List<Biology> biologyList;
    static List<Physic> physicList;

    public static void addMathScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        mathList = MathWRFile.readFileMath();
        List<Student> studentList = StudentManager.studentsList;

        for (int i = 0; i < studentList.size(); i++) {
                int stt = (mathList.size() > 0) ? (mathList.size() + 1) : 1;
                if (studentList.get(i).getStt() == stt) {
                    int stt1 = stt;
                    System.out.println("Stt " + stt1);
                    String name = studentList.get(i).getName();
                    System.out.println("Tên " + name);

                    double ktBaiCu = inputKtBaiCu();
                    double kt15p = inputKt15p();
                    double kt45p = inputKt45p();
                    double kthk = inputKthk();
                    double gpa = (ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7;
                    Subject math = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                    mathList.add(math);
                    MathWRFile.writeFileMath(mathList);
                }
            }
        }


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
                    double ktBaiCu = inputKtBaiCu();
                    double kt15p = inputKt15p();
                    double kt45p = inputKt45p();
                    double kthk = inputKthk();
                    Subject math = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk);
                    mathList.get(i).setKtBaiCu(math.getKtBaiCu());
                    mathList.get(i).setKt15p(math.getKt15p());
                    mathList.get(i).setKt45p(math.getKt45p());
                    mathList.get(i).setKthk(math.getKthk());

                    MathWRFile.writeFileMath(mathList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        MathWRFile.writeFileMath(mathList);
    }

//    public static void updateName() {
//        mathList = MathWRFile.readFileMath();
//
//    }

    public static void addChemistryScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        chemistryList = ChemistryWRFile.readFileChemistry();
        List<Student> studentList = StudentManager.studentsList;
        for (int i = 0; i < studentList.size(); i++) {
            int stt = (chemistryList.size() > 0) ? (chemistryList.size() + 1) : 1;
            if (studentList.get(i).getStt() == stt) {
                int stt1 = stt;
                System.out.println("Stt " + stt1);
                String name = studentList.get(i).getName();
                System.out.println("Tên " + name);

                double ktBaiCu = inputKtBaiCu();
                double kt15p = inputKt15p();
                double kt45p = inputKt45p();
                double kthk = inputKthk();
                double gpa = (ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7;
                Subject chemistry = new Subject(stt1, name, ktBaiCu, kt15p, kt45p, kthk, gpa);
                chemistryList.add(chemistry);
               ChemistryWRFile.writeFileChemistry(chemistryList);
            }
        }
    }

    public static double inputKtBaiCu() {
        double ktBaiCu;
        System.out.print("Nhập điểm kiểm tra bài cũ: ");
        while (true) {
            try {
                ktBaiCu = Integer.parseInt(sc.nextLine());
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
                kt15p = Integer.parseInt(sc.nextLine());
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
                kt45p = Integer.parseInt(sc.nextLine());
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
                kthk = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
                System.out.print("Nhập lại điểm: ");
            }
        }
        return kthk;
    }
}
