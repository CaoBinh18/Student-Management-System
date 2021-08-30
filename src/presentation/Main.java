package presentation;

import service.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose, choose2, choose3;

        do {
            Menu.menuLogin();
            while (true) {
                try {
                    choose = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Không hợp lệ!!!");
                }
            }

            switch (choose) {
                case 1:
                    LogIn.LoginTeacher();
                    break;
                case 2:
                    LogIn.LoginStudent();
                    break;
                case 3:
                    LogIn.LoginAdmin();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Bạn đã nhập sai!");
                    System.err.println("Hãy nhập lại: ");
                    break;
            }
        } while (true);

    }
}
