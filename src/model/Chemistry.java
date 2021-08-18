package model;

public class Chemistry {
    private double ktBaiCu;
    private double kt15p;
    private double kt45p;
    private double kthk;

    public Chemistry() {
    }

    public Chemistry(double ktBaiCu, double kt15p, double kt45p, double kthk) {
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
}
