package CodingFactoryTasks.ch13.bankapp.model;

public class Account {
    private static int counterId;
    private int id;
    private String iban;
    private int balance;

    public Account() {
        this.id = ++counterId;
    }

    public Account(String iban, int balance) {
        this.id = ++counterId;
        this.iban = iban;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        try {
            if (amount > balance) {
                throw new Exception("The balance will go negative");
            }
            balance -= amount;

            System.out.println("Balance withdraw success. The new balance is: " + getBalance());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
