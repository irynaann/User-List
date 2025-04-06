package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user id: ");
        int id = scanner.nextInt();
        userRepository.findUserById(id);
        System.out.println("Enter user email: ");
        scanner.nextLine();
        String email = scanner.next();
        userRepository.findUserByEmail(email);
        System.out.println("Enter user name: ");
        scanner.nextLine();
        String name = scanner.next();
        userRepository.findUserByName(name);
        userRepository.findAllUsers();
    }
}