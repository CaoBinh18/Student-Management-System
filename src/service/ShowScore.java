package service;

import data.MathWRFile;
import data.StudentWRFile;
import model.Math;
import model.Student;

import java.util.List;

public class ShowScore {

    public static void showScore() {
        ScoreStudent.mathList = MathWRFile.readFileMath();
        StudentManager.studentsList = StudentWRFile.readFile();
        List<Student> studentList = StudentManager.studentsList;
        System.out.println("===========Toán==========");
        System.out.printf("%5s | %20s | %10s | %10s | %10s | %10s%n", "Stt", "Tên", "KtBaiCu", "Kt15p", "Kt45p", "Kthk");
        for (Math math : ScoreStudent.mathList) {
            math.displayMath();
        }
    }
}
