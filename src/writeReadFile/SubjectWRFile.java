package writeReadFile;

import model.Subject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BiologyWRFile {
    public static void writeFileBiology(List<Subject> biologyList, String fileName) {
        try {
            File infile = new File("src\\Data\\"+fileName);
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Subject biology : biologyList) {
                bw.write(biology.getStt() +
                        ";" + biology.getName() +
                        ";" + biology.getKtBaiCu() +
                        ";" + biology.getKt15p() +
                        ";" + biology.getKt45p() +
                        ";" + biology.getKthk() +
                        ";" + biology.getGpa() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Subject> readFileBiology(String fileName) {
        List<Subject> biologyList = new ArrayList<>();
        try {
            File file = new File("src\\Data\\"+fileName);
            if (!file.exists()) {
             return   biologyList;
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ";";
            while ((line = br.readLine()) != null) {
                String[] biology = line.split(splitBy);
                Subject biology1 = new Subject();
                biology1.setStt(Integer.parseInt(biology[0]));
                biology1.setName(biology[1]);
                biology1.setKtBaiCu(Double.parseDouble(biology[2]));
                biology1.setKt15p(Double.parseDouble(biology[3]));
                biology1.setKt45p(Double.parseDouble(biology[4]));
                biology1.setKthk(Double.parseDouble(biology[5]));
                biology1.setGpa(Double.parseDouble(biology[6]));
                biologyList.add(biology1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return biologyList;
    }
}
