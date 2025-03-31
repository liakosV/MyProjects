package CodingFactoryTasks.ch12;

import CodingFactoryTasks.ch12.model.User;
import CodingFactoryTasks.ch12.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "Vasilis", "Liakos");
        UserCredentials userCredentials = new UserCredentials(1L, "admin", "12345");

        System.out.printf("{%d, %s, %s}", user.getId(), user.getFirstname(), user.getLastname());
        System.out.printf("\n{%d, %s, %s}", userCredentials.getId(), userCredentials.getUsername(), userCredentials.getPassword());
    }
}
