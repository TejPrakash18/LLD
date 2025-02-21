package solidforclass.singleresponsibility;

public class SaveBookDB {
    public void save(Book book) {
        System.out.println("Saving Book: " + book.getTitle() + " by " + book.getAuthor() + " to Database");
        // Database saving logic goes here
    }
}
