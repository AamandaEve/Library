
public class Book {
    String title;
    String author;
    String date;
    boolean status;
    String bookStatus;

    public Book(String title, String author, String date, boolean status){
        this.title = title;
        this.author = author;
        this.date = date;
        this.status = status;
    }

    public void bookStatus(){
        if(status == false){
            bookStatus = "Disponível";
        }else{
            bookStatus = "Indisponível";
        }
    }
    
    

    public boolean changeStatus(){
        if(status == false){
            status = true;
            return true;
        }else{
            status=false;
            return false;
        }
    }

    public void showInformations(){
        bookStatus();

        System.out.println(
        "____________LIVRO________________"
        + "\nTitulo: " + title 
        + "\nAutor: " + author 
        + "\nData de lançamenteo: " + date
        + "\nStatus: " + bookStatus
        + "\n\n________________________________|\n");
    }

    @Override
    public String toString() {
        bookStatus();
        return "____________LIVRO________________"
        + "\nTitulo: " + title 
        + "\nAutor: " + author 
        + "\nData de lançamenteo: " + date
        + "\nStatus: " + bookStatus
        + "\n________________________________|\n";
    }

}
