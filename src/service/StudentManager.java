package service;

import model.*;
import writeReadFile.*;

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
        System.out.println("Tên học sinh thứ: " + id);
        String name = inputName();
        System.out.println("Email: ");
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

        System.out.print("Nhập id học viên cần sửa: ");
        try {
            long id = Long.parseLong(sc.nextLine());
            for (int i = 0; i < studentsList.size(); i++) {
                if (studentsList.get(i).getId() == id) {
                    String name = inputName();
                    System.out.println("Email: ");
                    String email = inputEmail();
                    String birthday = inputBirthday();
                    String address = inputAddress();

                    Student student = new Student(id, name, email, birthday, address);
                    studentsList.get(i).setName(student.getName());
                    studentsList.get(i).setEmail(student.getEmail());
                    studentsList.get(i).setBirthday(student.getBirthday());
                    studentsList.get(i).setAddress(student.getAddress());
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
            System.out.println("ID không tồn tại. Hãy nhập lại");
        }
    }

    public static void delete() {
        studentsList = StudentWRFile.readFile();
        mathList = SubjectWRFile.readFileSubject("Maths.csv");
        chemistryList = SubjectWRFile.readFileSubject("Chemistrys.csv");
        biologyList = SubjectWRFile.readFileSubject("Biology.csv");
        physicList = SubjectWRFile.readFileSubject("Physic.csv");

        System.out.print("Nhập id của học sinh cần xóa: ");
        try {
            long id = Long.parseLong(sc.nextLine());

            for (int i = 0; i < mathList.size(); i++) {
                if (mathList.get(i).getId() == id) {
                    mathList.remove(i);
                }
            }

            for (int i = 0; i < chemistryList.size(); i++) {
                if (chemistryList.get(i).getId() == id) {
                    chemistryList.remove(i);
                }
            }

            for (int i = 0; i < biologyList.size(); i++) {
                if (biologyList.get(i).getId() == id) {
                    biologyList.remove(i);

                }
            }

            for (int i = 0; i < physicList.size(); i++) {
                if (physicList.get(i).getId() == id) {
                    physicList.remove(i);
                }
            }

            for (int i = 0; i < studentsList.size(); i++) {
                if (studentsList.get(i).getId() == id) {
                    studentsList.remove(i);
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
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getName().equalsIgnoreCase(nameStudent)){
                Student.displayStudent(studentsList.get(i));
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

    public static String inputName() {
        System.out.print("Tên học sinh(Viết hoa chữ cái đầu): ");
        String name = sc.nextLine();
        while (!checkName(name)) {
            System.err.println("Nhập tên không hợp lệ!!!");
            System.out.print("Tên học sinh: ");
            name = sc.nextLine();
        }
        return name.trim();
    }

    public static String inputEmail() {
//        System.out.println("Email: ");
        String email = sc.nextLine();
        while (!checkEmail(email)) {
            System.err.println("Email không hợp lệ!!!");
            System.out.println("Email: ");
            email = sc.nextLine();
        }
        return email.trim();
    }

    public static String inputBirthday() {
        System.out.print("Ngày sinh: ");
        String birthday = sc.nextLine();
        while (checkDateTime(birthday)) {
            System.err.println("Ngày tháng không hợp lệ. Hãy nhập lại!!!");
            System.out.print("Ngày sinh: ");
            birthday = sc.nextLine();
        }
        return birthday;
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
