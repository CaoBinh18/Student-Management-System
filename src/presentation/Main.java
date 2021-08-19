package presentation;

import service.ScoreStudent;
import service.ShowScore;
import service.StudentManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice, choice2, choice3;

        do {
            showMenu();
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
                    StudentManager.show();
                    break;
                case 2:
                    StudentManager.add();
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
                        menuScore();
                        while (true) {
                            try {
                                choice2 = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Không hợp lệ!!!");
                            }
                        }

                        switch (choice2) {
                            case 1:
                                ScoreStudent.addMathScore();
                                break;
                            case 2:
                                ScoreStudent.addChemistryScore();
                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 0:
                                showMenu();
                                break;
                            default:
                                System.err.println("Bạn đã nhập sai!");
                                System.err.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice2 != 0);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    do {
                        showScore();
                        while (true) {
                            try {
                                choice3 = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Không hợp lệ!!!");
                            }
                        }

                        switch (choice3) {
                            case 1 -> ShowScore.showScoreMath();
                            case 2 -> ShowScore.showScoreChmistry();
                            case 3 -> ShowScore.showScoreBiology();
                            case 4 -> ShowScore.showScorePhysic();
                            case 0 -> showMenu();
                            default -> {
                                System.err.println("Bạn đã nhập sai!");
                                System.err.println("Hãy nhập lại: ");
                            }
                        }
                    } while (choice3 != 0);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Bạn đã nhập sai!");
                    System.err.println("Hãy nhập lại: ");
                    break;
            }
        } while (true);
    }

    static void showMenu() {
        System.out.println("============MENU============");
        System.out.println("1. Xem danh sách học viên.");
        System.out.println("2. Thêm học viên.");
        System.out.println("3. Sửa thông tin học viên.");
        System.out.println("4. Xóa học viên.");
        System.out.println("5. Nhập điểm học viên.");
        System.out.println("6. Sửa điểm học viên.");
        System.out.println("7. Xếp loại học viên.");
        System.out.println("0. Thoát.");
        System.out.println("=============================");
        System.out.print("Nhập lựa chọn: ");

    }

    static void menuScore() {
        System.out.println("==========Nhập điểm các môn học==========");
        System.out.println("1. Nhập điểm Toán");
        System.out.println("2. Nhập điểm Hóa");
        System.out.println("3. Nhập điểm Sinh");
        System.out.println("4. Nhập điểm Lý");
        System.out.println("0. Quay lại Menu");
        System.out.println("=======================");
        System.out.print("Nhập lựa chọn: ");
    }

    static void showScore() {
        System.out.println("Hiển thị điểm thành phần môn học");
        System.out.println("1. Bảng điểm Toán");
        System.out.println("2. Bảng điểm Hóa");
        System.out.println("3. Bảng điểm Sinh");
        System.out.println("4. Bảng điểm Lý");
        System.out.println("0. Quay lại Menu");
        System.out.println("=============================");
        System.out.print("Nhập lựa chọn: ");
    }
}
