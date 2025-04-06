package app;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> userList = new ArrayList<>();

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
}
