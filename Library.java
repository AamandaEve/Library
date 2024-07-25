import java.util.ArrayList;
import java.util.function.Predicate;

public class Library {
    ArrayList<Book> booksList = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();

    public void addBook(Book book) {                                //adicionar livros
        booksList.add(book);
    }

    public ArrayList<Book> showBookList() {                         //mostrar lista de livros
        System.out.println("LISTA DE LIVROS: \n");
        booksList.forEach(System.out::println);
        return booksList;
    }

    public void addUser(User user) {                                //adicionar usuarios
        userList.add(user);
    }

    public ArrayList<User> showUserList() {                         //mostrar lista de usuarios
        System.out.println("LISTA DE USUÁRIOS");
        userList.forEach(System.out::println);
        return userList;
    }

    public void removeBook(Book book) {                             //excluir livro
        booksList.remove(book);
    }

    public void borrowBook(Book book, User user) {                  //emprestar livro
        book.changeStatus();
        user.addBorrowedBook(book);
    }

    public void returnBook(Book book, User user) {                  //devolver livro
        user.removeBorrowedBook(book);
        book.changeStatus();
    }

    public ArrayList<Book> showAvailableBooksList() {               //mostrar livros disponiveis
        System.out.println("LISTA DE LIVROS DISPONIVEIS: ");
        booksList.stream()
            .filter(a -> a.status == false)
            .map(a -> "- " + a.title + " (" + a.author + ")")
            .forEach(System.out::println);

        return booksList;
    }

    //public ArrayList<Book> ishowAvailableBooksList() {               //mostrar livros disponiveis
    //    System.out.println("LISTA DE LIVROS DISPONIVEIS: ");
    //    Predicate<Book> availableBook = a -> a.status == false;
    //    
    //    booksList.stream()
    //        .filter(a -> a.status == false)
    //        .map(a -> "- " + a.title + " (" + a.author + ")")
    //        .forEach(System.out::println);
//
    //    return booksList;
    //}



    public ArrayList<Book> showUnavailableBooksList(){              //mostrar livros indisponiveis
        System.out.println("LISTA DE LIVROS INDISPONIVEIS: ");
        booksList.stream()
            .filter(a -> a.status ==true)
            .map(a -> "- " + a.title + " (" + a.author + ")")
            .forEach(System.out::println);

        return booksList;
    }



}
