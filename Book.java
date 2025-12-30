import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Book {
    public String title;
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private int checkedOutCount = 0;
    Patron p = new Patron();
    // Book newBook

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

    //Searches for a book in the list
    //will print message to console if title cannot be found
     public void findBook() {
        System.out.println("Enter book title to find: ");
        String title = scanner.nextLine();

    //     for (Book b : books) {
    //         if (b.getTitle().equalsIgnoreCase(input)) {
    //             System.out.println("Found " + b.getTitle());
    //         } else {
    //             System.out.println("No book in system");
    //         }
    //    }

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("title found");
                return;
            }
        }

        System.out.println("No book was found with this title");
    }

    /* User adds new book to library System
    *   System will alert user if that book is alreay in system; no duplicates
    *   Once book is verified then added it will update Books.txt file 
    */ 
    public void addBook() throws IOException {
        System.out.println("Enter a book title");
        title = scanner.nextLine();
       
        // verifies there isn't a duplicate book already in the arraylist 
        // if (books.contains("harry") || books.contains(title))  {
        //     System.out.println("Book is already added");
        // } else {
        //     books.add(newbook);
        //     System.out.println(title + " was added");
        // }

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Books already exist in system");
                return;
            }
        }

        Book newbook = new Book(title);
        books.add(newbook);
        System.out.println(title + " was added");



        // FileWriter fw = new FileWriter("books.txt", true);
        // PrintWriter out = new PrintWriter(fw);

        // out.println(title);
        
        // out.close();
    }

    public void checkOutBook() throws FileNotFoundException {

	    System.out.println("Enter book you'd like to check out: ");
        String title = scanner.nextLine();

        boolean found = false;
         
        
                for (int i = 0; i < books.size(); i++) {
                Book b = books.get(i);
                    if (checkedOutCount < 3 ) {
                            if (b.getTitle().equalsIgnoreCase(title)) {
                                books.remove(i);
                                checkedOutCount++;
                                System.out.println(title + " has been checked out.");
                                System.out.println("Total books checked out: " + checkedOutCount);
                                found = true;
                                break;
                            }
                    } else {
                        System.out.println("You have reached max checkout limit");
                    }
                } 
                 
                if (!found) {
                    System.out.println("Book is not available.");
                }
            
    }

    public void returnBook() throws IOException {
        System.out.println("Enter a book title");
        String title = scanner.nextLine();


        Book newBook = new Book(title);
        books.add(newBook);
        System.out.println(newBook + " was returned");


        FileWriter fw = new FileWriter("books.txt", true);
        PrintWriter out = new PrintWriter(fw);

        out.println(newBook);
        
        out.close();
    }

    public void displayAllBooks() {
        //fix 
        if (books.size() == 0) {
            System.out.println("Currently no books in database");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

}
