package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    List<User> userList = new ArrayList<>();

    public Optional<User> findUserById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();

    }

}
