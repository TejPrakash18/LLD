package RepositoryPattern;

import java.util.*;

public class InMemoryUserRepo implements UserRepository {

    private final Map<Integer, User> database = new HashMap<>();

    @Override
    public User save(User user) {
        database.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public User findById(int id) {
        return database.get(id);
    }

    @Override
    public User deleteById(int id) {
         return database.remove(id);

    }

    @Override
    public void updateUserById(User user) {
        if (database.containsKey(user.getId())){
            database.put(user.getId(), user);
            System.out.println("User Updated!");
        }else {
            System.out.println("User not found!");
        }
    }
}
