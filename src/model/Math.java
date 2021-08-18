package model;

public class Math extends Student{
    private double ktBaiCu;
    private double kt15p;
    private double kt45p;
    private double kthk;

    public Math() {
    }

    public Math(double ktBaiCu, double kt15p, double kt45p, double kthk) {
        this.ktBaiCu = ktBaiCu;
        this.kt15p = kt15p;
        this.kt45p = kt45p;
        this.kthk = kthk;
    }

    public Math(int stt, String name, double ktBaiCu, double kt15p, double kt45p, double kthk) {
        super(stt, name);
        this.ktBaiCu = ktBaiCu;
        this.kt15p = kt15p;
        this.kt45p = kt45p;
        this.kthk = kthk;
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

    public void displayMath() {
        Math math = new Math(super.getStt(), super.getName(), ktBaiCu, kt15p, kt45p, kthk);

        System.out.printf("%5d | ", math.getStt());
        System.out.printf("%20s | ",math.getName());
        System.out.printf("%5f | ", math.getKtBaiCu());
        System.out.printf("%5f | ", math.getKt15p());
        System.out.printf("%5f | ", math.getKt45p());
        System.out.printf("%5f%n", math.getKthk());

    }
}
