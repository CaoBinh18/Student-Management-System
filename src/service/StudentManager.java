package service;

import WriteReadFile.*;
import model.Subject;
import model.Student;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static service.Regex.*;

public class StudentManager {
    private static final Scanner sc = new Scanner(System.in);
    static List<Student> studentsList;
    static List<Subject> mathList, chemistryList, biologyList, physicList;

    public static void show() {
        studentsList = StudentWRFile.readFile();
        System.out.format("%5s | %20s | %10s | %30s | %10s | %10s | %10s | %10s | %10s%n",
                "Stt", "Tên", "Ngày sinh", "Địa chỉ", "Toán", "Hóa", "Sinh", "Lý", "Điểm trung bình");
        for (Student student : studentsList) {
            student.displayStudent();
        }
    }

    public static void add() {
        studentsList = StudentWRFile.readFile();
        System.out.print("Số học sinh cần thêm (1 đến 10): ");
        try {
            int size = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < size; i++) {
                int stt = (studentsList.size() > 0) ? (studentsList.size() + 1) : 1;
                System.out.println("Stt: " + stt);
                System.out.println("Tên học sinh thứ: " + stt);
                String name = inputName();
                String birthday = inputBirthday();
                String address = inputAddress();

                Student student = new Student(stt, name, birthday, address);

                studentsList.add(student);
                StudentWRFile.writeFile(studentsList);
            }

        } catch (NumberFormatException e) {
            System.out.println("Nhập sai. Vui lòng nhập lại theo Menu!!");
        }
    }

    public static void edit() {
        studentsList = StudentWRFile.readFile();
        mathList = MathWRFile.readFileMath();
        chemistryList = ChemistryWRFile.readFileChemistry();
        biologyList = BiologyWRFile.readFileBiology();
        physicList = PhysicWRFile.readFilePhysic();

        System.out.print("Nhập Stt học viên cần sửa: ");
        try {
            int stt = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < studentsList.size(); i++) {
                if (studentsList.get(i).getStt() == stt) {
                    String name = inputName();
                    String birthday = inputBirthday();
                    String address = inputAddress();

                    Student student = new Student(stt, name, birthday, address);
                    studentsList.get(i).setName(student.getName());
                    studentsList.get(i).setBirthday(student.getBirthday());
                    studentsList.get(i).setAddress(student.getAddress());
                    StudentWRFile.writeFile(studentsList);

                    for (Subject math : mathList) {
                        if (math.getStt() == stt) {
                            math.setName(name);
                        }
                    }
                    MathWRFile.writeFileMath(mathList);

                    for (Subject chemistry : chemistryList) {
                        if (chemistry.getStt() == stt) {
                            chemistry.setName(name);
                        }
                    }
                    ChemistryWRFile.writeFileChemistry(chemistryList);

                    for (Subject biology : biologyList) {
                        if (biology.getStt() == stt) {
                            biology.setName(name);
                        }
                    }
                    BiologyWRFile.writeFileBiology(biologyList);

                    for (Subject physic : physicList) {
                        if (physic.getStt() == stt) {
                            physic.setName(name);
                        }
                    }
                    PhysicWRFile.writeFilePhysic(physicList);
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("ID không tồn tại. Hãy nhập lại");
        }
    }

    public static void delete() {
        studentsList = StudentWRFile.readFile();
        mathList = MathWRFile.readFileMath();
        chemistryList = ChemistryWRFile.readFileChemistry();
        biologyList = BiologyWRFile.readFileBiology();
        physicList = PhysicWRFile.readFilePhysic();

        System.out.print("Nhập stt của học sinh cần xóa: ");
        try {
            int stt = Integer.parseInt(sc.nextLine());
            studentsList.remove(stt - 1);
            mathList.remove(stt - 1);
            chemistryList.remove(stt - 1);
            biologyList.remove(stt -1);
            physicList.remove(stt - 1);

            for (Student student : studentsList) {
                if (student.getStt() > stt - 1) {
                    student.setStt(student.getStt() - 1);
                }
            }

            for (Subject math : mathList) {
                if (math.getStt() > stt - 1) {
                    math.setStt(math.getStt() - 1);
                }
            }

            for (Subject chemistry : chemistryList) {
                if (chemistry.getStt() > stt - 1) {
                    chemistry.setStt(chemistry.getStt() - 1);
                }
            }

            for (Subject biology : biologyList) {
                if (biology.getStt() > stt - 1) {
                    biology.setStt(biology.getStt() - 1);
                }
            }

            for (Subject physic : physicList) {
                if (physic.getStt() > stt - 1) {
                    physic.setStt(physic.getStt() - 1);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        StudentWRFile.writeFile(studentsList);
        MathWRFile.writeFileMath(mathList);
        ChemistryWRFile.writeFileChemistry(chemistryList);
        BiologyWRFile.writeFileBiology(biologyList);
        PhysicWRFile.writeFilePhysic(physicList);
    }

    public static String inputName() {
        String name;
        System.out.print("Tên học sinh: ");
        while (true) {
            try {
                name = new Scanner(System.in).nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Không hợp lệ!!!");
            }
        }
        return name;
    }

    public static String inputBirthday() {
        System.out.print("Ngày sinh: ");
        String birthday = sc.nextLine();
        while (checkDateTime(birthday)) {
            System.out.println("Ngày tháng không hợp lệ. Hãy nhập lại!!!");
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
                System.out.println("Không hợp lệ!!!");
            }
        }
        return address;
    }


}
