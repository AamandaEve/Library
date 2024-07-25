import java.util.ArrayList;

public interface Options {
    public void registerBook(Book book);
    public void removeBook(Book book);
    public void registerUser(User user);
    public void borrowBook(Book book);
    public void returnBook(Book book);
    public ArrayList<Book> showAvailableBooks();
    public ArrayList<Book> showUnavailableBooks();
    public ArrayList<Book> showAllBooks();
}
