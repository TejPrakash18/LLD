package RepositoryPattern;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    List<User> findAll();
    User findById(int id);
    void updateUserById(User user);
    User deleteById(int id);
}
