import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class InterfaceGUI extends JFrame{
    private Library library = new Library();

    
    public InterfaceGUI(){
        library = new Library();
        setupUI();
    }

    public void setupUI(){
        setTitle("BIBLIOTECA");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton bRegistrarLivro = new JButton("Registrar Livro");
        //JButton bRemoverLivro = new JButton("Remover Livro");
        //JButton bRegistrarUsuario = new JButton("Registrar Usuário");
        //JButton bEmprestarLivro = new JButton("Emprestar Livro");
        //JButton bDevolverLivro = new JButton("Devolver Livro");
        //JButton bMostrarLivros = new JButton("Mostrar Livros");

        bRegistrarLivro.addActionListener(e -> registrarLivro());

        add(bRegistrarLivro);
    }

    private void registrarLivro(){
        String titulo = JOptionPane.showInputDialog("Titulo do livro");
        String autor = JOptionPane.showInputDialog("Autor do Livro:");
        String ano = JOptionPane.showInputDialog("Ano do Livro:");
        Book book = new Book(titulo, autor, ano, rootPaneCheckingEnabled);
        library.addBook(book);
        JOptionPane.showMessageDialog(this, "Livro Registrado com sucesso!");
    }

}
