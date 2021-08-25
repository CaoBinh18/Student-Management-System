package WriteReadFile;

import model.Subject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MathWRFile {
    public static void writeFileMath(List<Subject> mathList) {
        try {
            File infile = new File("src\\Data\\Maths.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Subject math : mathList) {
                bw.write(math.getStt() +
                        ";" + math.getName() +
                        ";" + math.getKtBaiCu() +
                        ";" + math.getKt15p() +
                        ";" + math.getKt45p() +
                        ";" + math.getKthk() +
                        ";" + math.getGpa() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Subject> readFileMath() {
        List<Subject> mathList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\Maths.csv");
            if (!infile.exists()) {
                writeFileMath(mathList);
            }
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ";";
            while ((line = br.readLine()) != null) {
                String[] math = line.split(splitBy);
                Subject math1 = new Subject();
                math1.setStt(Integer.parseInt(math[0]));
                math1.setName(math[1]);
                math1.setKtBaiCu(Double.parseDouble(math[2]));
                math1.setKt15p(Double.parseDouble(math[3]));
                math1.setKt45p(Double.parseDouble(math[4]));
                math1.setKthk(Double.parseDouble(math[5]));
                math1.setGpa(Double.parseDouble(math[6]));
                mathList.add(math1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mathList;
    }
}
