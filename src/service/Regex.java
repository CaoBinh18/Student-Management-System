package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean checkDateTime(String str) {
        String regex = "([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)(((1)(9)[9][0-9])|((2)(0)[0-1][0-5]))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return !matcher.matches();
    }

    public static boolean checkSize(String str) {
        String regex = "^\\[1-10]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean checkRegex(String str, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean checkName(String str) {
        String regex = "^[A-Za-z]\\\\s+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean checkSroceStudent(String str) {
        String regex = "^\\d\\.\\d|[10\\.0]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static String convertInt(String str) {
        if (str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")|| str.equals("5")||
                str.equals("6")||str.equals("7")||str.equals("8")|| str.equals("9")||str.equals("10")) {
            str = str + ".0";
        }
        return str;
    }
}
