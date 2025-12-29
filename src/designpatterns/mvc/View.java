package designpatterns.mvc;

import java.util.Scanner;

public class View {
    private Scanner sc = new Scanner(System.in);

    public int getUserId(){
        System.out.println("Enter Student ID");
        return sc.nextInt();
    }
    public String getUserName(){
        System.out.println("Enter Student Name");
        return sc.next();
    }
    public int getUserAge(){
        System.out.println("Enter Student Age");
        return sc.nextInt();
    }

    public void showUser(UserModel user){
        if(user == null){
            System.out.println("user not found!");
        }
        else{
            System.out.println("Student ID: " + user.getId());
            System.out.println("Student Name: " + user.getName());
            System.out.println("Student Age: " + user.getAge());
        }

    }
}
