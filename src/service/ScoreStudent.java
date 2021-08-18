package service;

import data.ChemistryWRFile;
import data.MathWRFile;
import data.StudentWRFile;
import model.*;
import model.Math;

import java.util.List;
import java.util.Scanner;

public class ScoreStudent {
    private static final Scanner sc = new Scanner(System.in);
    static List<Math> mathList;
    static List<Chemistry> chemistryList;
    static List<Biology> biologyList;
    static List<Physic> physicList;

//    public static void showScore() {
//        mathList = MathWRFile.readFileScore();
//        StudentManager.studentsList = StudentWRFile.readFile();
//        List<Student> studentList = StudentManager.studentsList;
//        System.out.printf("%15s | %10s | %10s | %10s | %10s%n", "Môn Học", "KtBaiCu", "Kt15p", "Kt45p", "Kthk");
//        for (Math math : mathList) {
//            math.displayScore();
//        }
//    }



    public static void mathScore() {
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
                    Math math = new Math(stt1, name, ktBaiCu, kt15p, kt45p, kthk);
//                    mathList.get(i).setStt(math.getStt());
//                    mathList.get(i).setStt(math.getStt());
                    mathList.add(math);
                    MathWRFile.writeFileMath(mathList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        MathWRFile.writeFileMath(mathList);
    }

    public static void chemistryScore() {
        StudentManager.studentsList = StudentWRFile.readFile();
        chemistryList = ChemistryWRFile.readFileChemistry();
        List<Student> studentList = StudentManager.studentsList;
        System.out.print("Stt học viên: ");
        try {
            int stt = Integer.parseInt((sc.nextLine()));
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStt() == stt) {

                    double ktBaiCu = inputKtBaiCu();
                    double kt15p = inputKt15p();
                    double kt45p = inputKt45p();
                    double kthk = inputKthk();
                    Chemistry chemistry = new Chemistry(ktBaiCu, kt15p, kt45p, kthk);
//                    scoreList.get(i).setSubject(score.getSubject());
//                    scoreList.get(i).setKtBaiCu(score.getKtBaiCu());
//                    scoreList.get(i).setKt15p(score.getKt15p());
//                    scoreList.get(i).setKt45p(score.getKt45p());
//                    scoreList.get(i).setKtBaiCu(score.getKtBaiCu());
                    System.out.println("Hóa");
                    chemistryList.add(chemistry);
                    ChemistryWRFile.writeFileChemistry(chemistryList);
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai: ");
        }
        MathWRFile.writeFileMath(mathList);
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
//        StudentManager.studentsList = StudentWRFile.readFile();
//        System.out.println("Id học viên: ");
//        try {
//            int id = Integer.parseInt(sc.nextLine());
//            for (int i = 0; i < StudentManager.studentsList.size(); i++) {
//                if (StudentManager.studentsList.get(i).getId() == id) {
//                    double physic = inputPhysic();
//                    double chemistry = inputChemistry();
//                    double math = inputMath();
//
//                    Student student = new Student(id, physic, chemistry, math);
//                    StudentManager.studentsList.get(i).setPhysicScore(student.getPhysicScore());
//                    StudentManager.studentsList.get(i).setChemistryScore(student.getChemistryScore());
//                    StudentManager.studentsList.get(i).setMathScore(student.getMathScore());
//                    break;
//                }
//            }
//
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }
//        StudentWRFile.writeFile(StudentManager.studentsList);
//    }
//
//    public static double inputChemistry() {
//        double chemistry;
//        System.out.print("Nhập điểm Hóa: ");
//        while (true) {
//            try {
//                chemistry = Integer.parseInt(sc.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
//                System.out.print("Nhập điểm Hóa: ");
//            }
//        }
//        return chemistry;
//    }
//
//    public static double inputMath() {
//        double math;
//        System.out.print("Nhập điểm Toán: ");
//        while (true) {
//            try {
//                math = Integer.parseInt(sc.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
//                System.out.print("Nhập điểm Toán: ");
//            }
//        }
//        return math;
//    }
//
//    public static double inputPhysic() {
//        double physic;
//        System.out.print("Nhập điểm Lý: ");
//        while (true) {
//            try {
//                physic = Integer.parseInt(sc.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Nhập sai định dạng. Vui lòng nhập lại!");
//                System.out.print("Nhập điểm lý: ");
//            }
//        }
//        return physic;
//    }
//}
