package service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean checkDateTime(String dayTime) {
        String regex = "([0-2]?[0-9]|(3)[0-1])[-|/](((0)?[0-9])|((1)[0-2]))[-|/](((1)(9)[9][0-9])|((2)(0)[0-1][0-5]))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dayTime);
        return matcher.matches();
    }

    public static boolean checkName(String name) {
//        String regex = "^([A-Z][a-z]+[ ]*)+$";
        String regex = "^([AÀẢÃÁẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÈÉẺẼẸÊỀẾỂỄỆFGHIÍÌỈĨỊJKLMNOÒÓỎÕỌÔỒỐỔỖỘƠỜỚỞỠỢPQRSTUÙÚỦŨỤƯỪỨỬỮỰVWXYÝỲỶỸỴZ]" +
                "[aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+[ ]*)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }


    public static boolean checkEmail(String email) {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean checkPassword(String str) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean checkScoreStudent(String str) {
        String regex = "([0-9]\\.\\d)|([1][0])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static String convertInt(String str) {
        if (str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") ||
                str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals("10")) {
            str = str + ".0";
        }
        return str;
    }

    public static String inputPassword() {
        String password = new Scanner(System.in).nextLine();
        while (!checkPassword(password)) {
            System.out.println("Mật khẩu không hợp lệ!!!");
            System.out.print("Mật khẩu: ");
            password = new Scanner(System.in).nextLine();
        }
        return password.trim();
    }
}
