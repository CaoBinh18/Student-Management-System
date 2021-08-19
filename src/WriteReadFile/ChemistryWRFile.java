package WriteReadFile;

import model.Chemistry;
import model.Subject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChemistryWRFile {
    public static void writeFileChemistry(List<Subject> chemistryList) {

        try {
            File infile = new File("src\\Data\\Chemistrys.csv");

            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Subject chemistry : chemistryList) {
                bw.write(chemistry.getStt() +
                        ", " + chemistry.getName() +
                        ", " + chemistry.getKtBaiCu() +
                        ", " + chemistry.getKt15p() +
                        ", " + chemistry.getKt45p() +
                        ", " + chemistry.getKthk() +
                        ", " + chemistry.getGpa() +
                        "\n");
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Subject> readFileChemistry() {
        List<Subject> chemistryList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\Chemistrys.csv");
            if (!infile.exists()) {
                writeFileChemistry(chemistryList);
            }
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] chemistry = line.split(splitBy);
                Subject chemistry1 = new Subject();
                chemistry1.setStt(Integer.parseInt(chemistry[0]));
                chemistry1.setName(chemistry[1]);
                chemistry1.setKtBaiCu(Double.parseDouble(chemistry[2]));
                chemistry1.setKt15p(Double.parseDouble(chemistry[3]));
                chemistry1.setKt45p(Double.parseDouble(chemistry[4]));
                chemistry1.setKthk(Double.parseDouble(chemistry[5]));
                chemistry1.setGpa(Double.parseDouble(chemistry[6]));
                chemistryList.add(chemistry1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chemistryList;
    }
}
