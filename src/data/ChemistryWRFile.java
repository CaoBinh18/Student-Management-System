package data;

import model.Chemistry;
import model.Math;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChemistryWRFile {
    public static void writeFileChemistry(List<Chemistry> chemistryList) {

        try {
            File infile = new File("src\\Data\\Chemistrys.csv");
            if(!infile.exists()) {
                infile.createNewFile();
            } else {
                FileWriter fw = new FileWriter(infile);
                BufferedWriter bw = new BufferedWriter(fw);

                for (Chemistry chemistry : chemistryList) {
                    bw.write(chemistry.getKtBaiCu() +
                            ", " + chemistry.getKt15p() +
                            ", " + chemistry.getKt45p() +
                            ", " + chemistry.getKthk() +
                            "\n");
                }
                bw.close();
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Chemistry> readFileChemistry() {
        List<Chemistry> chemistryList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\Chemistrys.csv");
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] chemistry = line.split(splitBy);
                Chemistry chemistry1 = new Chemistry();
                chemistry1.setKtBaiCu(Double.parseDouble(chemistry[0]));
                chemistry1.setKt15p(Double.parseDouble(chemistry[1]));
                chemistry1.setKt45p(Double.parseDouble(chemistry[2]));
                chemistry1.setKthk(Double.parseDouble(chemistry[3]));
                chemistryList.add(chemistry1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chemistryList;
    }
}
