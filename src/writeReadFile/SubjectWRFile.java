package writeReadFile;

import model.Subject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectWRFile {
    public static void writeFileSubject(List<Subject> subjectList, String fileName) {
        try {
            File infile = new File("src\\Data\\" + fileName);
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Subject subject : subjectList) {
                bw.write(subject.getId() +
                        ";" + subject.getName() +
                        ";" + subject.getKtBaiCu() +
                        ";" + subject.getKt15p() +
                        ";" + subject.getKt45p() +
                        ";" + subject.getKthk() +
                        ";" + subject.getGpa() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Subject> readFileSubject(String fileName) {
        List<Subject> subjectList = new ArrayList<>();
        try {
            File file = new File("src\\Data\\" + fileName);
            if (!file.exists()) {
                return subjectList;
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ";";
            while ((line = br.readLine()) != null) {
                String[] subject = line.split(splitBy);
                Subject subject1 = new Subject();
                subject1.setId(Long.parseLong(subject[0]));
                subject1.setName(subject[1]);
                subject1.setKtBaiCu(Double.parseDouble(subject[2]));
                subject1.setKt15p(Double.parseDouble(subject[3]));
                subject1.setKt45p(Double.parseDouble(subject[4]));
                subject1.setKthk(Double.parseDouble(subject[5]));
                subject1.setGpa(Double.parseDouble(subject[6]));
                subjectList.add(subject1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return subjectList;
    }
}
