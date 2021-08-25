package model;

public class Student {
    private int stt;
    private String name;
    private String birthday;
    private String address;
    private double physicScore, chemistryScore, mathScore, biologyScore, gpa1;

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

    public Student(int stt, String name, String birthday, String address, double mathScore, double chemistryScore, double biologyScore, double physicScore, double gpa1) {
        this.stt = stt;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.mathScore = mathScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
        this.physicScore = physicScore;
        this.gpa1 = gpa1;
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

    public double getGpa1() {
        return gpa1 = java.lang.Math.round(((mathScore + chemistryScore + biologyScore + physicScore) / 4) * 100.0) / 100.0;
    }

    public void setGpa1(double gpa1) {
        this.gpa1 = gpa1;
    }

    public void displayStudent() {
        Student student = new Student(stt, name, birthday, address, mathScore, chemistryScore, biologyScore, physicScore, gpa1);
        System.out.format("%5d | ", student.getStt());
        System.out.format("%20s | ", student.getName());
        System.out.format("%10s | ", student.getBirthday());
        System.out.format("%30s | ", student.getAddress());
        System.out.format("%10.2f | ", student.getMathScore());
        System.out.format("%10.2f | ", student.getChemistryScore());
        System.out.format("%10.2f | ", student.getBiologyScore());
        System.out.format("%10.2f | ", student.getPhysicScore());
        System.out.printf("%10.2f%n", student.getGpa1());
    }

    @Override
    public String toString() {
        return "%5d | " + getStt() +
                "%20s | " + getName() +
                "%10s | " + getBirthday() +
                "%30s | " + getBirthday() +
                "%10s | " + getMathScore() +
                "%10s | " + getChemistryScore() +
                "%10s | " + getBiologyScore() +
                "%10s | " + getPhysicScore() +
                "%10s%n" + getGpa1();
    }
}
