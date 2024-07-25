import java.util.ArrayList;

public class User{
    String name;
    String id;
    ArrayList<Book> borrowedsBooks = new ArrayList<>();

    public User(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void showUserInformation(){
        System.out.println(
            "________USUARIO__________"
           + "\nNome: " + name 
           + "\nID: " + id 
           + "\n________________________|");
    }
    @Override
    public String toString() {
        return "________USUARIO__________"
           + "\nNome: " + name 
           + "\nID: " + id 
           + "\n________________________|";
    }

    public ArrayList<Book> showUserBooks(){
        System.out.println("Lista de livros de " + this.name +": ");
        borrowedsBooks.forEach(System.out::println);
        return borrowedsBooks;
    }

    public void addBorrowedBook(Book book){
        borrowedsBooks.add(book);
    }

    public void removeBorrowedBook(Book book){
        borrowedsBooks.remove(book);
    }
}
