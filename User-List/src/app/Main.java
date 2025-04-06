package app;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new User(1, "Alice", "alice@example.com"));
        userRepository.addUser(new User(2, "Mike", "mike@example.com"));
        userRepository.addUser(new User(3, "Cat", "cat@example.com"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user id: ");
        int id = scanner.nextInt();
        userRepository.findUserById(id);
        System.out.println("Enter user email: ");
        String email = scanner.next();
        userRepository.findUserByEmail(email);


    }
}
