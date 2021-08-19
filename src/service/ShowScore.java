package service;

import WriteReadFile.ChemistryWRFile;
import WriteReadFile.MathWRFile;
import WriteReadFile.StudentWRFile;
import model.Subject;
import model.Student;

import java.util.List;

public class ShowScore {

    public static void showScoreMath() {
        ScoreStudent.mathList = MathWRFile.readFileMath();
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Toán==========");
        System.out.printf("%5s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Stt", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject math : ScoreStudent.mathList) {
            math.display();
        }
    }

    public static void showScoreChmistry() {
        ScoreStudent.chemistryList = ChemistryWRFile.readFileChemistry();
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Hóa==========");
        System.out.printf("%5s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Stt", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject chemisrty : ScoreStudent.chemistryList) {
            chemisrty.display();
        }
    }

    public static void showScoreBiology() {
        ScoreStudent.mathList = MathWRFile.readFileMath();
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Sinh==========");
        System.out.printf("%5s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Stt", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject math : ScoreStudent.mathList) {
            math.display();
        }
    }

    public static void showScorePhysic() {
        ScoreStudent.mathList = MathWRFile.readFileMath();
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Toán==========");
        System.out.printf("%5s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Stt", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject math : ScoreStudent.mathList) {
            math.display();
        }
    }
}
