package designpatterns.mvc;

public class UserController {
    private UserService userService;
    private View view;
    public UserController(UserService userService, View view){
        this.userService = userService;
        this.view = view;
    }
    public void createUser(){
        int id = view.getUserId();
        String name = view.getUserName();
        int age = view.getUserAge();


        userService.addUser(id,name,age);
    }

    public void displayUser(){
        int id = view.getUserId();
        UserModel user = userService.getUser(id);
        view.showUser(user);
    }
}
