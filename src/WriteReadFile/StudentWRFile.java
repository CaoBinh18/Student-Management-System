package WriteReadFile;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentWRFile {

    public static void writeFile(List<Student> studentList) {

        try {
            File infile = new File("src\\Data\\student.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student student : studentList) {
                bw.write(student.getStt() +
                        ", " + student.getName() +
                        ", " + student.getBirthday() +
                        ", " + student.getAddress() +
                        ", " + student.getMathScore() +
                        ", " + student.getChemistryScore() +
                        ", " + student.getBiologyScore() +
                        ", " + student.getPhysicScore() +
                        ", " + student.getGpa1() +
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
            File infile = new File("src\\Data\\student.csv");
            if (!infile.exists()) {
                writeFile(studentList);
            }

            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] student = line.split(splitBy);
                Student student1 = new Student();
                student1.setStt(Integer.parseInt(student[0]));
                student1.setName(student[1]);
                student1.setBirthday(student[2]);
                student1.setAddress(student[3]);
                student1.setMathScore(Double.parseDouble(student[4]));
                student1.setChemistryScore(Double.parseDouble(student[5]));
                student1.setBiologyScore(Double.parseDouble(student[6]));
                student1.setPhysicScore(Double.parseDouble(student[7]));
                student1.setGpa1(Double.parseDouble(student[8]));
                studentList.add(student1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
