package designpatterns.mvc;

public class Driver {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        View view = new View();

        UserController userController = new UserController(userService,view);
        userController.createUser();
        userController.displayUser();
    }
}
