package model;

public class Subject {
    private String name;
    private long id;
    private double ktBaiCu;
    private double kt15p;
    private double kt45p;
    private double kthk;
    private double gpa;
    private boolean delete = false;

    public Subject() {
    }

    public Subject(long id, String name, double ktBaiCu, double kt15p, double kt45p, double kthk) {
        this.id = id;
        this.name = name;
        this.ktBaiCu = ktBaiCu;
        this.kt15p = kt15p;
        this.kt45p = kt45p;
        this.kthk = kthk;

    }

    public Subject(long id, String name, double ktBaiCu, double kt15p, double kt45p, double kthk, double gpa) {
        this.id = id;
        this.name = name;
        this.ktBaiCu = ktBaiCu;
        this.kt15p = kt15p;
        this.kt45p = kt45p;
        this.kthk = kthk;
        this.gpa = gpa;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getKtBaiCu() {
        return ktBaiCu;
    }

    public void setKtBaiCu(double ktBaiCu) {
        this.ktBaiCu = ktBaiCu;
    }

    public double getKt15p() {
        return kt15p;
    }

    public void setKt15p(double kt15p) {
        this.kt15p = kt15p;
    }

    public double getKt45p() {
        return kt45p;
    }

    public void setKt45p(double kt45p) {
        this.kt45p = kt45p;
    }

    public double getKthk() {
        return kthk;
    }

    public void setKthk(double kthk) {
        this.kthk = kthk;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display() {
        if (!delete) {
            System.out.printf("%15d | ", id);
            System.out.printf("%20s | ", name);

            if (ktBaiCu == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", ktBaiCu);
            }

            if (kt15p == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", kt15p);
            }

            if (kt45p == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", kt45p);
            }

            if (kthk == 0.0) {
                System.out.format("%10s | ", "N/A");

            } else {
                System.out.format("%10.2f | ", kthk);
            }

            if (gpa == 0.0) {
                System.out.format("%10s%n", "N/A");

            } else {
                System.out.format("%10.2f%n", gpa);
            }
        }
    }
}
