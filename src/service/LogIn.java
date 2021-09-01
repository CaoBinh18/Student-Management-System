package service;

import model.AccountsPassword;
import writeReadFile.AccountPasswordWRFile;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class LogIn {
    static List<AccountsPassword> accountTeacherList, accountStudentList;

    public static void LoginTeacher() {
        int choice1, choice2, choice3, choice4, choice5;

        accountTeacherList = AccountPasswordWRFile.readFile("accountTeacher.csv");

        System.out.print("Tên đăng nhập(email): ");
        String useName = StudentManager.inputEmail();

        System.out.print("Mật khẩu: ");
        String password = Regex.inputPassword();

        for (AccountsPassword acc : accountTeacherList) {
            if (acc.getAccount().equals(useName) && acc.getPassword().equals(password)) {

                do {
                    Menu.showMenu();
                    while (true) {
                        try {
                            choice1 = new Scanner(System.in).nextInt();
                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Không hợp lệ!!!");
                        }
                    }

                    switch (choice1) {
                        case 1:
                            StudentManager.show();
                            break;
                        case 2:
                            StudentManager.add();
                            StudentManager.show();
                            break;
                        case 3:
                            StudentManager.show();
                            StudentManager.edit();
                            System.out.println("Danh sách sau khi sửa:");
                            StudentManager.show();
                            break;
                        case 4:
                            StudentManager.show();
                            StudentManager.delete();
                            System.out.println("Danh sách sau khi xóa:");
                            StudentManager.show();
                            break;
                        case 5:
                            do {
                                Menu.menuScore();
                                while (true) {
                                    try {
                                        choice2 = new Scanner(System.in).nextInt();
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.println("Không hợp lệ!!!");
                                    }
                                }

                                switch (choice2) {
                                    case 1 -> {
                                        StudentManager.show();
                                        ScoreStudent.addMathScore();
                                        ShowScore.showScoreMath();
                                    }
                                    case 2 -> {
                                        StudentManager.show();
                                        ScoreStudent.addChemistryScore();
                                        ShowScore.showScoreChemistry();
                                    }
                                    case 3 -> {
                                        StudentManager.show();
                                        ScoreStudent.addBiologyScore();
                                        ShowScore.showScoreBiology();
                                    }
                                    case 4 -> {
                                        StudentManager.show();
                                        ScoreStudent.addPhysicScore();
                                        ShowScore.showScorePhysic();
                                    }
                                    case 0 -> System.out.println("Quay lại Menu");
                                    default -> {
                                        System.out.println("Bạn đã nhập sai!");
                                        System.out.println("Hãy nhập lại: ");
                                    }
                                }
                            } while (choice2 != 0);
                            break;
                        case 6:
                            do {
                                Menu.MenuEditScore();
                                while (true) {
                                    try {
                                        choice3 = new Scanner(System.in).nextInt();
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.println("Không hợp lệ!!!");
                                    }
                                }

                                switch (choice3) {
                                    case 1 -> {
                                        EditScore.editMathScore();
                                        ShowScore.showScoreMath();
                                    }
                                    case 2 -> {
                                        EditScore.editChemistryScore();
                                        ShowScore.showScoreChemistry();
                                    }
                                    case 3 -> {
                                        EditScore.editBiologyScore();
                                        ShowScore.showScoreBiology();
                                    }
                                    case 4 -> {
                                        EditScore.editPhysicScore();
                                        ShowScore.showScorePhysic();
                                    }
                                    case 0 -> System.out.println("Quay lại Menu");
                                    default -> {
                                        System.out.println("Bạn đã nhập sai!");
                                        System.out.println("Hãy nhập lại: ");
                                    }
                                }
                            } while (choice3 != 0);
                            break;
                        case 7:
                            do {
                                Menu.menuSort();
                                while (true) {
                                    try {
                                        choice4 = new Scanner(System.in).nextInt();
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.println("Không hợp lệ!!!");
                                    }
                                }

                                switch (choice4) {
                                    case 1:
                                        StudentManager.sortStudentGPA();
                                        break;
                                    case 2:
                                        StudentManager.sortStudentName();
                                        break;
                                    case 0:
                                        System.out.println("Quay lại Menu");
                                        break;
                                    default:
                                        System.out.println("Bạn đã nhập sai!");
                                        System.out.println("Hãy nhập lại: ");
                                        break;
                                }
                            } while (choice4 != 0);
                            break;
                        case 8:

                            do {
                                Menu.showScore();
                                while (true) {
                                    try {
                                        choice5 = new Scanner(System.in).nextInt();
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.println("Không hợp lệ!!!");
                                    }
                                }

                                switch (choice5) {
                                    case 1 -> ShowScore.showScoreMath();
                                    case 2 -> ShowScore.showScoreChemistry();
                                    case 3 -> ShowScore.showScoreBiology();
                                    case 4 -> ShowScore.showScorePhysic();
                                    case 0 -> System.out.println("Quay lại Menu");
                                    default -> {
                                        System.out.println("Bạn đã nhập sai!");
                                        System.out.println("Hãy nhập lại: ");
                                    }
                                }
                            } while (choice5 != 0);
                            break;
                        case 0:
                            System.out.println("Quay lại Menu Login");
                            break;
                        default:
                            System.out.println("Bạn đã nhập sai!");
                            System.out.println("Hãy nhập lại: ");
                            break;
                    }
                } while (choice1 != 0);
                return;
            } else {
                System.out.println("Sai tài khoản hoặc mật khẩu!!!");
                return;
            }
        }
    }

    public static void LoginStudent() {
        int choose, choice2;
        accountStudentList = AccountPasswordWRFile.readFile("accountStudent.csv");

        System.out.print("Tên đăng nhập(email): ");
        String useName = StudentManager.inputEmail();

        System.out.print("Mật khẩu: ");
        String password = Regex.inputPassword();

        for (AccountsPassword accountsPassword : accountStudentList) {
            if (accountsPassword.getAccount().equals(useName) || accountsPassword.getPassword().equals(password)) {

                do {
                    Menu.menuStudent();
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
                            StudentManager.show();
                            break;
                        case 2:
                            do {
                                Menu.showScore();
                                while (true) {
                                    try {
                                        choice2 = new Scanner(System.in).nextInt();
                                        break;
                                    } catch (InputMismatchException e) {
                                        System.out.println("Không hợp lệ!!!");
                                    }
                                }

                                switch (choice2) {
                                    case 1 -> ShowScore.showScoreMath();
                                    case 2 -> ShowScore.showScoreChemistry();
                                    case 3 -> ShowScore.showScoreBiology();
                                    case 4 -> ShowScore.showScorePhysic();
                                    case 0 -> System.out.println("Quay lại Menu");
                                    default -> {
                                        System.out.println("Bạn đã nhập sai!");
                                        System.out.println("Hãy nhập lại: ");
                                    }
                                }
                            } while (choice2 != 0);
                            break;
                        case 3:
                            StudentManager.findStudentName();
                            break;
                        case 4:
                            StudentManager.editPassStudent();
                            break;
                        case 0:
                            System.out.println("Quay lại menu LogIn");
                            break;
                        default:
                            System.out.println("Bạn đã nhập sai!");
                            System.out.println("Hãy nhập lại: ");
                            break;
                    }
                } while (choose != 0);
                return;
            } else {
                System.out.println("Sai tài khoản hoặc mật khẩu!!!");
                return;
            }
        }
    }

    public static void LoginAdmin() {
        int choice;
        do {
            Menu.menuAdmin();
            while (true) {
                try {
                    choice = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Không hợp lệ!!!");
                }
            }

            switch (choice) {
                case 1:
                    accountTeacherList = AccountPasswordWRFile.readFile("accountTeacher.csv");
                    System.out.print("Nhập tên: ");
                    String teacher = StudentManager.inputEmail();

                    System.out.print("Mật khẩu: ");
                    String password = Regex.inputPassword();

                    AccountsPassword accountsPassword = new AccountsPassword(teacher, password);
                    accountTeacherList.add(accountsPassword);
                    AccountPasswordWRFile.writeFile(accountTeacherList, "accountTeacher.csv");
                    System.out.println("Đăng kí thành công!");
                    break;
                case 2:
                    accountTeacherList = AccountPasswordWRFile.readFile("accountTeacher.csv");
                    System.out.print("Nhập email đăng nhập: ");
                    String useName = StudentManager.inputEmail();

                    for (int i = 0; i < accountTeacherList.size(); i++) {
                        if (Objects.equals(accountTeacherList.get(i).getAccount(), useName)) {
                            String account = accountTeacherList.get(i).getAccount();
                            System.out.print("Nhập mật khẩu mới: ");
                            String pass = Regex.inputPassword();
                            AccountsPassword accountsPassword1 = new AccountsPassword(account, pass);

                            accountTeacherList.get(i).setPassword(accountsPassword1.getPassword());
                            AccountPasswordWRFile.writeFile(accountTeacherList, "accountTeacher.csv");
                            System.out.println("Đã đổi mật khẩu!!!");
                        }
                    }
                    System.out.println("Tài khoản chưa đăng ký!!!");
                    break;
                case 3:
                    accountTeacherList = AccountPasswordWRFile.readFile("accountTeacher.csv");
                    System.out.print("Nhập tài khoản cần xóa: ");
                    String useNamee = StudentManager.inputEmail();

                    for (int i = 0; i < accountTeacherList.size(); i++) {
                        if (accountTeacherList.get(i).getAccount() == useNamee) {
                            accountTeacherList.remove(i);
                        }
                    }

                    AccountPasswordWRFile.writeFile(accountTeacherList, "accountTeacher.csv");
                    break;
                case 0:
                    System.out.println("Quay lại menu LogIn");
                    break;
                default:
                    System.out.println("Bạn đã nhập sai!");
                    System.out.println("Hãy nhập lại: ");
                    break;
            }
        } while (choice != 0);
    }
}
