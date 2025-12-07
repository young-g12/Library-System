import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    public String title;
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override 
    public String toString(){
        return this.title;
    }

     public void findBook () {
        System.out.println("Enter book title or author to find: ");
        String title = scanner.nextLine();
        for (Book b : books) {
            if (books.contains(this.title)) {
                System.out.println(b);
            } 
        }
        System.out.println("No book with this tile");
    }


    public void addBook() {
        System.out.println("Enter a book title");
        String title = scanner.nextLine();

        Book newBook = new Book(title);
        books.add(newBook);
        System.out.println(newBook + " was added");
    }


    

}
