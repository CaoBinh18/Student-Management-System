package writeReadFile;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentWRFile {
    public static void writeFile(List<Student> studentList) {

        try {
            File infile = new File("src\\data\\student.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student student : studentList) {
                bw.write(student.getId() +
                        ";" + student.getName() +
                        ";" + student.getEmail() +
                        ";" + student.getBirthday() +
                        ";" + student.getAddress() +
                        ";" + student.getMathScore() +
                        ";" + student.getChemistryScore() +
                        ";" + student.getBiologyScore() +
                        ";" + student.getPhysicScore() +
                        ";" + student.getGpa1() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Student> readFile() {
        List<Student> studentList = new ArrayList<>();
        try {
            File file = new File("src\\data\\student.csv");
            if (!file.exists()) {
                return studentList;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ";";
            while ((line = br.readLine()) != null) {
                String[] student = line.split(splitBy);
                Student student1 = new Student();
                student1.setID(Long.parseLong(student[0]));
                student1.setName(student[1]);
                student1.setEmail(student[2]);
                student1.setBirthday(student[3]);
                student1.setAddress(student[4]);
                student1.setMathScore(Double.parseDouble(student[5]));
                student1.setChemistryScore(Double.parseDouble(student[6]));
                student1.setBiologyScore(Double.parseDouble(student[7]));
                student1.setPhysicScore(Double.parseDouble(student[8]));
                student1.setGpa1(Double.parseDouble(student[9]));
                studentList.add(student1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static List<Student> readLoginFile() {
        List<Student> LoginStudent = new ArrayList<>();
        try {
            File file = new File("src\\data\\LoginStudent.csv");
            if (!file.exists()) {
                return LoginStudent;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ";";
            while ((line = br.readLine()) != null) {
                String[] student = line.split(splitBy);
                Student student1 = new Student();;
                student1.setEmail(student[0]);
                LoginStudent.add(student1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return LoginStudent;
    }
}
