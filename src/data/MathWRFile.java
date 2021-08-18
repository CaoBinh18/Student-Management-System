package data;

import model.Math;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MathWRFile {
    public static void writeFileMath(List<Math> mathList) {
        try {
            File infile = new File("src\\Data\\Maths.csv");
            if(!infile.exists()) {
                infile.createNewFile();
            } else {
                FileWriter fw = new FileWriter(infile);
                BufferedWriter bw = new BufferedWriter(fw);

                for (Math math : mathList) {
                    bw.write(math.getStt() +
                            ", " + math.getName() +
                            ", " + math.getKtBaiCu() +
                            ", " + math.getKt15p() +
                            ", " + math.getKt45p() +
                            ", " + math.getKthk() +
                            "\n");
                }
                bw.close();
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Math> readFileMath() {
        List<Math> mathList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\Maths.csv");
            if(!infile.exists()) {
                infile.createNewFile();
            } else {
                FileReader fr = new FileReader(infile);
                BufferedReader br = new BufferedReader(fr);

                String line;
                String splitBy = ", ";
                while ((line = br.readLine()) != null) {
                    String[] math = line.split(splitBy);
                    Math math1 = new Math();
                    math1.setStt(Integer.parseInt(math[0]));
                    math1.setName(math[1]);
                    math1.setKtBaiCu(Double.parseDouble(math[2]));
                    math1.setKt15p(Double.parseDouble(math[3]));
                    math1.setKt45p(Double.parseDouble(math[4]));
                    math1.setKthk(Double.parseDouble(math[5]));
                    mathList.add(math1);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mathList;
    }
}
