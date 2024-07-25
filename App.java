//import javax.swing.SwingUtilities;

public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        //SwingUtilities.invokeLater(() ->{
        //    InterfaceGUI gui = new InterfaceGUI();
        //    gui.setVisible(true);
        //});
        
        Book book1 = new Book("Chapeuzinho Vermelho", "Rita Lee","07122021", false);
        Book book2 = new Book("Cidade de Papel","Camila Pitanga", "17072024", false);

        User user1 = new User("Amanda","1234");
        User user2 = new User("Evellin","5678");

        Library library = new Library();
        library.addUser(user1);
        library.addBook(book1);
        library.borrowBook(book1, user1);
        user1.showUserBooks();
        library.returnBook(book1, user1);
        user1.showUserBooks();
        library.showAvailableBooksList();
        
    }
}
