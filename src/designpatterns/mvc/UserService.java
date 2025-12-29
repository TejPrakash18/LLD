package designpatterns.mvc;

public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void addUser(int id, String name, int age) {
        UserModel userModel = new UserModel(id, name, age);
        userRepository.save(userModel);
    }

    public UserModel getUser(int id){
        return userRepository.findById(id);
    }
}

