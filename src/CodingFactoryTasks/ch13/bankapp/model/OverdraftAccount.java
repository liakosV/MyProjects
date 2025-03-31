package CodingFactoryTasks.ch13.bankapp.model;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, int balance) {
        super(iban, balance);
    }

    @Override
    public void withdraw(int amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        }
        System.out.println("Success in withdraw. The new balance is: " + getBalance());
    }
}
