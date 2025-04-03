package CodingFactoryTasks.AccountApp.model;

public class Account extends AbstractEntity {
    private String iban;
    private double balance;
    private User user;

    public Account() {}

    public Account(String iban, double balance, User user) {
        this.iban = iban;
        this.balance = balance;
        this.user = user;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
