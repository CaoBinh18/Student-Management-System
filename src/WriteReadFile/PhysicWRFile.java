package WriteReadFile;

import model.Subject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhysicWRFile {
    public static void writeFilePhysic(List<Subject> physicList) {
        try {
            File infile = new File("src\\Data\\Physic.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Subject physic : physicList) {
                bw.write(physic.getStt() +
                        ", " + physic.getName() +
                        ", " + physic.getKtBaiCu() +
                        ", " + physic.getKt15p() +
                        ", " + physic.getKt45p() +
                        ", " + physic.getKthk() +
                        ", " + physic.getGpa() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Subject> readFilePhysic() {
        List<Subject> physicList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\Physic.csv");
            if (!infile.exists()) {
                writeFilePhysic(physicList);
            }
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] physic = line.split(splitBy);
                Subject physic1 = new Subject();
                physic1.setStt(Integer.parseInt(physic[0]));
                physic1.setName(physic[1]);
                physic1.setKtBaiCu(Double.parseDouble(physic[2]));
                physic1.setKt15p(Double.parseDouble(physic[3]));
                physic1.setKt45p(Double.parseDouble(physic[4]));
                physic1.setKthk(Double.parseDouble(physic[5]));
                physic1.setGpa(Double.parseDouble(physic[6]));
                physicList.add(physic1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return physicList;
    }
}
