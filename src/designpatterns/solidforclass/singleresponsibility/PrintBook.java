package solidforclass.singleresponsibility;

public class PrintBook {
    public void print(Book book) {
        System.out.println("Printing Book: " + book.getTitle() + " by " + book.getAuthor());
    }
}
