package model;

public class Student {
    private int stt;
    private String name;
    private String birthday;
    private String address;
    private double physicScore, chemistryScore, mathScore, biologyScore, gpa;

    public Student() {
    }

    public Student(int stt, String name, String birthday, String address) {
        this.stt = stt;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public Student(int stt, String name) {
        this.stt = stt;
        this.name = name;
    }

    public Student(int stt, String name, String birthday, String address, double physicScore, double chemistryScore, double mathScore, double biologyScore, double gpa) {
        this.stt = stt;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
        this.mathScore = mathScore;
        this.gpa = gpa;
    }


    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {

    }

    public void displayStudent() {
        Student student = new Student(stt, name, birthday, address, mathScore, chemistryScore, biologyScore, physicScore, gpa);
        System.out.format("%5d | ", student.getStt());
        System.out.format("%20s | ", student.getName());
        System.out.format("%10s | ", student.getBirthday());
        System.out.format("%20s | ", student.getAddress());
        System.out.format("%10f | ", student.getMathScore());
        System.out.format("%10f | ", student.getChemistryScore());
        System.out.format("%10f | ", student.getBiologyScore());
        System.out.format("%10f%n", student.getMathScore());
    }
}
