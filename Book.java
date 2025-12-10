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


    public void addBook() throws IOException {
        System.out.println("Enter a book title");
        String title = scanner.nextLine();

        Book newBook = new Book(title);
        books.add(newBook);
        System.out.println(newBook + " was added");


        FileWriter fw = new FileWriter("books.txt", true);
        PrintWriter out = new PrintWriter(fw);

        out.println(newBook);
        
        out.close();
    }

    public void checkOutBook() throws FileNotFoundException {
        File inputFile = new File("books.txt");
        File tempFile = new File("tempFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            System.out.println("Enter a book title: ");

            String lineToRemove = "This is the line to remove."; // Define the line to be removed
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
            // Trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if (!trimmedLine.equals(lineToRemove)) {
                writer.write(currentLine + System.getProperty("line.separator"));
            }
   }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String title = scanner.nextLine();
        Book newBook = new Book(title);
        //does not remove book from system
        books.remove(newBook);
        System.out.println(newBook + " is checked out");
        
    }

    public void returnBook() {

    }

    public void displayAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }


    

}
