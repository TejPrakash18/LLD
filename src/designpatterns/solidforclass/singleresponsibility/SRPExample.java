package solidforclass.singleresponsibility;

public class SRPExample {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin");

        PrintBook printBook = new PrintBook();
        printBook.print(book);

        SaveBookDB saveBook = new SaveBookDB();
        saveBook.save(book);
    }
}