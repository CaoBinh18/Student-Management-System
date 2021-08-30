package service;


import writeReadFile.*;
import model.Subject;
import model.Student;

import java.util.List;

public class ShowScore {

    public static void showScoreMath() {
        ScoreStudent.mathList = SubjectWRFile.readFileSubject( "Maths.csv");
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Toán==========");
        System.out.printf("%15s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Id", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject math : ScoreStudent.mathList) {
            math.display();
        }
    }

    public static void showScoreChemistry() {
        ScoreStudent.chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Hóa==========");
        System.out.printf("%15s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Id", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject chemisrty : ScoreStudent.chemistryList) {
            chemisrty.display();
        }
    }

    public static void showScoreBiology() {
        ScoreStudent.biologyList = SubjectWRFile.readFileSubject("Biology.csv");
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Sinh==========");
        System.out.printf("%15s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Id", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject biology : ScoreStudent.biologyList) {
            biology.display();
        }
    }

    public static void showScorePhysic() {
        ScoreStudent.physicList = SubjectWRFile.readFileSubject("Physic.csv");
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("                          ===========Lý==========");
        System.out.printf("%15s | %20s | %10s | %10s | %10s | %10s | %10s%n", "Id", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk", "GPA");
        for (Subject physic : ScoreStudent.physicList) {
            physic.display();
        }
    }
}
