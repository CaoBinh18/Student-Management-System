package presentation;

import service.EditScore;
import service.ScoreStudent;
import service.ShowScore;
import service.StudentManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice, choice2, choice3, choice4;

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
                                ScoreStudent.addBiologyScore();
                                break;
                            case 4:
                                ScoreStudent.addPhysicScore();
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
                    do {
                        MenuEditScore();
                        while (true) {
                            try {
                                choice3 = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Không hợp lệ!!!");
                            }
                        }

                        switch (choice3) {
                            case 1:
                                EditScore.editMathScore();
                                break;
                            case 2:
                                EditScore.editChemistryScore();
                                break;
                            case 3:
                                EditScore.editBiologyScore();
                                break;
                            case 4:
                                EditScore.editPhysicScore();
                                break;
                            case 0:
                                showMenu();
                                break;
                            default:
                                System.err.println("Bạn đã nhập sai!");
                                System.err.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice3 != 0);
                    break;
                case 7:
                    break;
                case 8:
                    do {
                        showScore();
                        while (true) {
                            try {
                                choice4 = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Không hợp lệ!!!");
                            }
                        }

                        switch (choice4) {
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
                    } while (choice4 != 0);
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
        System.out.println("\n============MENU============");
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("8. Bảng điểm môn học");
        System.out.println("0. Thoát.");
        System.out.println("=============================");
        System.out.print("Nhập lựa chọn: ");

    }

    static void menuScore() {
        System.out.println("\n=====Nhập điểm các môn học======");
        System.out.println("1. Nhập điểm Toán");
        System.out.println("2. Nhập điểm Hóa");
        System.out.println("3. Nhập điểm Sinh");
        System.out.println("4. Nhập điểm Lý");
        System.out.println("0. Quay lại Menu");
        System.out.println("================================");
        System.out.print("Nhập lựa chọn: ");
    }

    static void showScore() {
        System.out.println("\n======Hiển thị điểm thành phần môn học======");
        System.out.println("1. Bảng điểm Toán");
        System.out.println("2. Bảng điểm Hóa");
        System.out.println("3. Bảng điểm Sinh");
        System.out.println("4. Bảng điểm Lý");
        System.out.println("0. Quay lại Menu");
        System.out.println("==================================");
        System.out.print("Nhập lựa chọn: ");
    }

    static void MenuEditScore() {
        System.out.println("\nChỉnh sửa điểm");
        System.out.println("1. Sửa điểm Toán");
        System.out.println("2. Sửa điểm Hóa");
        System.out.println("3. Sửa điểm Sinh");
        System.out.println("4. Sửa điểm Lý");
        System.out.println("0. Quay lại Menu");
        System.out.println("==================================");
        System.out.print("Nhập lựa chọn: ");
    }
}
