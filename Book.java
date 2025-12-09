import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Book {
    public String title;
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Book() {

    }
    
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

     public void findBook(Book title) {
        System.out.println("Enter book title or author to find: ");
        String input = scanner.nextLine();

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(input)) {
                System.out.println("Found " + b.getTitle());
            } else {
                System.out.println("no book");
            }
        }
    }


    public void addBook() throws FileNotFoundException {
        System.out.println("Enter a book title");
        String title = scanner.nextLine();

        Book newBook = new Book(title);
        books.add(newBook);
        System.out.println(newBook + " was added");
        File fileout = new File("books.txt");
        PrintWriter out = new PrintWriter(fileout);

        out.println(newBook);
        out.close();
    }

    public void displayAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void checkOutBook() throws FileNotFoundException {
        File checkout = new File("BooksCheckOutList");
        PrintWriter out = new PrintWriter(checkout);
    }


    

}
