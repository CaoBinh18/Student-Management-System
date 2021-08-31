package model;

public class Student {
    private long id;
    private String name;
    private String email;
    private String birthday;
    private String address;
    private double physicScore, chemistryScore, mathScore, biologyScore, gpa1;
    private boolean isDelete = false;

    public Student() {
    }

    public Student(long id, String name, String email, String birthday, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, String birthday, String email, String address, double mathScore, double chemistryScore, double biologyScore, double physicScore, double gpa1) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.mathScore = mathScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
        this.physicScore = physicScore;
        this.gpa1 = gpa1;
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void displayStudent(Student student) {
        System.out.format("%15d | ", student.getId());
        System.out.format("%20s | ", student.getName());
        System.out.format("%25s | ", student.getEmail());
        System.out.format("%10s | ", student.getBirthday());
        System.out.format("%25s | ", student.getAddress());
        System.out.format("%10.2f | ", student.getMathScore());
        System.out.format("%10.2f | ", student.getChemistryScore());
        System.out.format("%10.2f | ", student.getBiologyScore());
        System.out.format("%10.2f | ", student.getPhysicScore());
        System.out.printf("%10.2f%n", student.gpa1);
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public long getId() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(double physicScore) {
        this.physicScore = physicScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getBiologyScore() {
        return biologyScore;
    }

    public void setBiologyScore(double biologyScore) {
        this.biologyScore = biologyScore;
    }

    public double getGpa1() {
        return gpa1 = java.lang.Math.round(((mathScore + chemistryScore + biologyScore + physicScore) / 4) * 100.0) / 100.0;
    }

    public void setGpa1(double gpa1) {
        this.gpa1 = gpa1;
    }

    public void displayStudent() {
        if (!isDelete) {
            System.out.format("%15d | ", id);
            System.out.format("%20s | ", name);
            System.out.format("%25s | ", email);
            System.out.format("%10s | ", birthday);
            System.out.format("%25s | ", address);
            if (mathScore == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", mathScore);
            }

            if (chemistryScore == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", chemistryScore);
            }

            if (biologyScore == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", biologyScore);
            }

            if (physicScore == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", physicScore);
                ;
            }

            if (gpa1 == 0.0) {
                System.out.format("%10s%n", "N/A");

            } else {
                System.out.printf("%10.2f%n", gpa1);
            }
        }
    }
}
