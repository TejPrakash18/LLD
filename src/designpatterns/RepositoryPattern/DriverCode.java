package RepositoryPattern;

public class DriverCode {
    public static void main(String[] args) {
        InMemoryUserRepo user = new InMemoryUserRepo();
        user.save(new User(1,"Tej", "tej22upa.dhyay@gmail.com"));
        user.save(new User(2,"Neha", "nehaVarshney07@gmail.com"));
        user.save(new User(3, "Laxman", "laxman@011@gmail.com"));

        System.out.println("All users");
        user.findAll().forEach(System.out::println);

        System.out.println("find by id user");
        User userById = user.findById(1);
        System.out.println(userById);

        System.out.println("delete user by id");

        User deleteUserById = user.deleteById(2);
        System.out.println(deleteUserById);

        System.out.println("After delete user by id");

        user.findAll().forEach(System.out::println);

        System.out.println("User update");
        user.updateUserById(new User(1,"Tej Upadhyay", "tej22upa.dhyay@gmail.com"));
        user.findAll().forEach(System.out::println);
    }
}
