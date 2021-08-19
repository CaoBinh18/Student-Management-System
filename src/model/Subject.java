package model;

public class Subject extends Student{
    private double ktBaiCu;
    private double kt15p;
    private double kt45p;
    private double kthk;
    private double gpa;

    public Subject() {
    }

    public Subject(int stt, String name, double ktBaiCu, double kt15p, double kt45p, double kthk) {
        super(stt, name);
        this.ktBaiCu = ktBaiCu;
        this.kt15p = kt15p;
        this.kt45p = kt45p;
        this.kthk = kthk;

    }

    public Subject(int stt, String name, double ktBaiCu, double kt15p, double kt45p, double kthk, double gpa) {
        super(stt, name);
        this.ktBaiCu = ktBaiCu;
        this.kt15p = kt15p;
        this.kt45p = kt45p;
        this.kthk = kthk;
        this.gpa = gpa;
    }

//    public Subject(int stt, String name) {
//        super(stt, name);
//    }

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
        this.gpa = (ktBaiCu + kt15p + (kt45p * 2) + (kthk * 3)) / 7;
    }

    public void display() {
        Subject subject = new Subject(super.getStt(), super.getName(), ktBaiCu, kt15p, kt45p, kthk, gpa);

        System.out.printf("%5d | ", subject.getStt());
        System.out.printf("%20s | ", subject.getName());
        System.out.printf("%10f | ", subject.getKtBaiCu());
        System.out.printf("%10f | ", subject.getKt15p());
        System.out.printf("%10f | ", subject.getKt45p());
        System.out.printf("%10f | ", subject.getKthk());
        System.out.printf("%10f%n", subject.getGpa());

    }


}
