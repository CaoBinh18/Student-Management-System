package model;

public class AcountPassword {
    private String acount;
    private String password;

    public AcountPassword() {
    }

    public AcountPassword(String acount, String password) {
        this.acount = acount;
        this.password = password;
    }

    public AcountPassword(String pass) {
        this.password = pass;
    }

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
