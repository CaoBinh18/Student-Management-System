package writeReadFile;

import model.AccountsPassword;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountPasswordWRFile {
    public static void writeFile(List<AccountsPassword> accountPasswordList, String fileName) {

        try {
            File infile = new File("src\\data\\" + fileName);
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (AccountsPassword accountsPassword : accountPasswordList) {
                bw.write(accountsPassword.getAccount() +
                        ";" + accountsPassword.getPassword() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<AccountsPassword> readFile(String fileName) {
        List<AccountsPassword> accountsPasswordList = new ArrayList<>();
        try {
            File file = new File("src\\data\\" + fileName);
            if (!file.exists()) {
                return accountsPasswordList;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ";";
            while ((line = br.readLine()) != null) {
                String[] acountPassword = line.split(splitBy);
                AccountsPassword accountsPassword1 = new AccountsPassword();
                accountsPassword1.setAccount(acountPassword[0]);
                accountsPassword1.setPassword(acountPassword[1]);
                accountsPasswordList.add(accountsPassword1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accountsPasswordList;
    }
}
