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
     public void findBook(Book title) {
        System.out.println("Enter book title to find: ");
        String input = scanner.nextLine();

    //     for (Book b : books) {
    //         if (b.getTitle().equalsIgnoreCase(input)) {
    //             System.out.println("Found " + b.getTitle());
    //         } else {
    //             System.out.println("No book in system");
    //         }
    //    }

        if (getTitle().contains(input)) {
            System.out.println("Found " + getTitle());
        } else {
            System.out.println("No puede encontrar el libro, lo siento");

        }
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
        // int count = 0;
//         File inputFile = new File("books.txt");
//         File tempFile = new File("tempFile.txt");
//         BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//         try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
//             System.out.println("Enter a book title: ");

//             String lineToRemove = "This is the line to remove."; // Define the line to be removed
//             String currentLine;
//             while ((currentLine = reader.readLine()) != null) {
//             // Trim newline when comparing with lineToRemove
//             String trimmedLine = currentLine.trim();
//             if (!trimmedLine.equals(lineToRemove)) {
//                 writer.write(currentLine + System.getProperty("line.separator"));
//             }
//    }
//         } catch (FileNotFoundException e) {
//             throw e;
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
        // Loop checkout here; will not let user checkout more than 3 items
        // Book newBook = new Book(title);
	    System.out.println("Enter book you'd like to check out: ");
        title = scanner.nextLine();

          for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("There are no books to check out");
                
            }
        }
    
        books.remove(title);
        System.out.println(title + " is removed");

        // if (books.contains(books)) {
        //     books.remove(title);
        //     System.out.println(title + " is checked out");
        //     count++;
        //     if (count == 3) {
        //         System.out.println("Cannot checkout anymore books");
        //     }
        // } else {
        //     System.out.println("Book is not available to checkout");
        // }
        //does not remove book from system
        
    }

    public void returnBook() {
         System.out.println("Enter a book title");
        String title = scanner.nextLine();


        Book newBook = new Book(title);
        books.add(newBook);
        System.out.println(newBook + " was returned");


        // FileWriter fw = new FileWriter("books.txt", true);
        // PrintWriter out = new PrintWriter(fw);

        // out.println(newBook);
        
        // out.close();
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
