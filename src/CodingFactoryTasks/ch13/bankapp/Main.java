package CodingFactoryTasks.ch13.bankapp;

import CodingFactoryTasks.ch13.bankapp.model.Account;
import CodingFactoryTasks.ch13.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        Account user1 = new Account("GR12342341234", 100);
        Account user2 = new Account();
        Account user3 = new Account("Gr213409821354", 1000);

        System.out.println(user1.getId());
        System.out.println(user2.getId());
        System.out.println(user3.getId());

        user1.withdraw(300);


    }
}
