package service;

import model.*;
import writeReadFile.*;

import javax.swing.*;
import java.util.*;

import static service.Regex.*;

public class StudentManager {
    private static final Scanner sc = new Scanner(System.in);
    static List<Student> studentsList;
    static List<AccountsPassword> accountStudentList;
    static List<Subject> mathList, chemistryList, biologyList, physicList;

    public static void show() {
        studentsList = StudentWRFile.readFile();
        System.out.format("%15s | %20s | %25s | %10s | %25s | %10s | %10s | %10s | %10s | %10s%n",
                "Id", "Tên", "Email", "Ngày sinh", "Địa chỉ", "Toán", "Hóa", "Sinh", "Lý", "Điểm trung bình");
        for (Student student : studentsList) {
            student.displayStudent();
        }
    }

    public static void show(List<Student> studentList) {
        studentsList = StudentWRFile.readFile();
        System.out.format("%15s | %20s | %25s | %10s | %25s | %10s | %10s | %10s | %10s | %10s%n",
                "Id", "Tên", "Email", "Ngày sinh", "Địa chỉ", "Toán", "Hóa", "Sinh", "Lý", "Điểm trung bình");
        for (Student student : studentList) {
            student.displayStudent();
        }
    }

    public static void add() {

        studentsList = StudentWRFile.readFile();
        accountStudentList = AccountPasswordWRFile.readFile("accountStudent.csv");
        long id = System.currentTimeMillis();
        System.out.println("Id: " + id);
        String name = inputName();
        System.out.print("Email: ");
        String email = inputEmail();
        String birthday = inputBirthday();
        String address = inputAddress();

        Student student = new Student(id, name, email, birthday, address);
        studentsList.add(student);
        StudentWRFile.writeFile(studentsList);

        AccountsPassword accountsPassword = new AccountsPassword(student.getEmail(), "Abcd1234");
        accountStudentList.add(accountsPassword);
        AccountPasswordWRFile.writeFile(accountStudentList, "accountStudent.csv");

    }

    public static void edit() {
        studentsList = StudentWRFile.readFile();
        mathList = SubjectWRFile.readFileSubject("Maths.csv");
        chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");
        biologyList = SubjectWRFile.readFileSubject("Biology.csv");
        physicList = SubjectWRFile.readFileSubject("Physic.csv");

        int choice;
        System.out.print("Nhập id học viên cần sửa: ");
        try {
            long id = Long.parseLong(sc.nextLine());

            for (Student student : studentsList) {
                if (student.getId() == id) {

                    do {
                        Menu.menuEdit();
                        while (true) {
                            try {
                                choice = new Scanner(System.in).nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Nhập sai");
                            }
                        }

                        switch (choice) {
                            case 1:
                                String name = inputName();
                                student.setName(name);
                                break;
                            case 2:
                                System.out.print("Email: ");
                                String email = inputEmail();
                                student.setEmail(email);
                                break;
                            case 3:
                                String birthday = inputBirthday();
                                student.setBirthday(birthday);
                                break;
                            case 4:
                                String address = inputAddress();
                                student.setAddress(address);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai!");
                                System.out.println("Hãy nhập lại: ");
                                break;
                        }
                    } while (choice != 0);

                    System.out.println("Thêm thành công!!!");
                    String name = student.getName();
                    StudentWRFile.writeFile(studentsList);
                    for (Subject math : mathList) {
                        if (math.getId() == id) {
                            math.setName(name);
                        }
                    }
                    SubjectWRFile.writeFileSubject(mathList, "Maths.csv");

                    for (Subject chemistry : chemistryList) {
                        if (chemistry.getId() == id) {
                            chemistry.setName(name);
                        }
                    }
                    SubjectWRFile.writeFileSubject(chemistryList, "Chemistrys.csv");

                    for (Subject biology : biologyList) {
                        if (biology.getId() == id) {
                            biology.setName(name);
                        }
                    }
                    SubjectWRFile.writeFileSubject(biologyList, "Biology.csv");

                    for (Subject physic : physicList) {
                        if (physic.getId() == id) {
                            physic.setName(name);
                        }
                    }
                    SubjectWRFile.writeFileSubject(physicList, "Physic.csv");
                    break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("ID không tồn tại!!!");
            System.out.print("Nhập lại ID: ");
        }
    }

    public static void delete() {
        studentsList = StudentWRFile.readFile();
        mathList = SubjectWRFile.readFileSubject("Maths.csv");
        chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");
        biologyList = SubjectWRFile.readFileSubject("Biology.csv");
        physicList = SubjectWRFile.readFileSubject("Physic.csv");

        System.out.print("Nhập ID của học sinh cần xóa: ");
        try {
            long id = Long.parseLong(sc.nextLine());

            for (Subject math : mathList) {
                if (math.getId() == id) {
                    math.setDelete(true);
                }
            }

            for (Subject chemistry : chemistryList) {
                if (chemistry.getId() == id) {
                    chemistry.setDelete(true);
                }
            }

            for (Subject biology : biologyList) {
                if (biology.getId() == id) {
                    biology.setDelete(true);

                }
            }

            for (Subject physic : physicList) {
                if (physic.getId() == id) {
                    physic.setDelete(true);
                }
            }

            for (Student student : studentsList) {
                if (student.getId() == id) {
                    student.setDelete(true);
                }
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        StudentWRFile.writeFile(studentsList);
        SubjectWRFile.writeFileSubject(mathList, "Maths.csv");
        SubjectWRFile.writeFileSubject(chemistryList, "Chemistrys.csv");
        SubjectWRFile.writeFileSubject(biologyList, "Biology.csv");
        SubjectWRFile.writeFileSubject(physicList, "Physic.csv");
    }

    public static void findStudentName() {
        studentsList = StudentWRFile.readFile();

        System.out.print("Tìm tên: ");
        String nameStudent = sc.nextLine();

        System.out.println("Result: ");
        for (Student student : studentsList) {
            if (student.getName().equalsIgnoreCase(nameStudent)) {
                Student.displayStudent(student);
            }
        }
    }

    public static void sortStudentGPA() {
        List<Student> studentGPAList;
        studentGPAList = StudentWRFile.readFile();
        studentGPAList.sort(new SortStudentGpa());
        show(studentGPAList);
    }

    public static void sortStudentName() {
        List<Student> studentNameList;
        studentNameList = StudentWRFile.readFile();
        studentNameList.sort(new SortStudentName());
        show(studentNameList);
    }

    public static void editPassStudent() {
        accountStudentList = AccountPasswordWRFile.readFile("accountStudent.csv");
        System.out.print("Nhập email đăng nhập: ");
        String useName = StudentManager.inputEmail();

        for (int i = 0; i < accountStudentList.size(); i++) {
            if (Objects.equals(accountStudentList.get(i).getAccount(), useName)) {
                String account = accountStudentList.get(i).getAccount();
                System.out.println("Nhập mật khẩu mới");
                String password = Regex.inputPassword();
                AccountsPassword accountsPassword = new AccountsPassword(account, password);

                accountStudentList.get(i).setPassword(accountsPassword.getPassword());
                AccountPasswordWRFile.writeFile(accountStudentList, "accountStudent.csv");
            }
        }
    }

    public static String inputName() {
        System.out.print("Tên học sinh (Ví dụ: Cao Thanh Bình): ");
        String name = sc.nextLine();
        while (!checkName(name)) {
            System.out.println("Tên không hợp lệ!!!");
            System.out.print("Tên học sinh (Ví dụ: Cao Thanh Bình): ");
            name = sc.nextLine();
        }
        return name.trim();
    }

    public static String inputEmail() {
        String email = sc.nextLine();
        while (!checkEmail(email)) {
            System.out.println("Email không hợp lệ!!!");
            System.out.print("Email: ");
            email = sc.nextLine();
        }
        return email.trim();
    }

    public static String inputBirthday() {
        System.out.print("Ngày sinh (dd/mm/yyyy): ");
        String birthday = sc.nextLine();
        while (!checkDateTime(birthday)) {
            System.out.println("Ngày tháng không hợp lệ. Hãy nhập lại!!!");
            System.out.print("Ngày sinh (dd/mm/yyyy): ");
            birthday = sc.nextLine();
        }
        return birthday.trim();
    }

    public static String inputAddress() {
        String address;
        System.out.print("Địa chỉ: ");
        while (true) {
            try {
                address = sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Không hợp lệ!!!");
            }
        }
        return address.trim();
    }

}
