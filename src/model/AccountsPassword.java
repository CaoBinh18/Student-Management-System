package model;

public class AccountsPassword {
    private String account;
    private String password;

    public AccountsPassword() {
    }

    public AccountsPassword(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public AccountsPassword(String pass) {
        this.password = pass;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
