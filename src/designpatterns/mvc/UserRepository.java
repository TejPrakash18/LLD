package designpatterns.mvc;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<Integer, UserModel> db = new HashMap<>();

    public void save(UserModel userModel) {
        db.put(userModel.getId(),userModel);
    }
    public UserModel findById(int id) {
        return db.get(id);
    }
}
