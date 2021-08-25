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

    public static boolean checkSroceStudent(String str) {
        String regex = "^\\d\\.\\d|[10\\.0]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
