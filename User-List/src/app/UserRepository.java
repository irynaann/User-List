package app;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public Optional<User> findUserById(int id) {
        Optional<User> user = userList.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
        user.ifPresentOrElse(
                u -> System.out.println("User id is " + u.getId()),
                () -> System.out.println("User id is not found")
        );
        return user;
    }

    public Optional<User> findUserByEmail(String email) {
        Optional<User> user = userList.stream()
                .filter(u -> u.getEmail() == email)
                .findFirst();
        user.ifPresentOrElse(
                u -> System.out.println("User email is " + u.getEmail()),
                () -> System.out.println("User email is not found")
        );
        return user;
    }


}
