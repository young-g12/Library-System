import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter");
        // ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Library System ");
            System.out.println("1. Search Book by title");
            System.out.println("2. Add book");
            System.out.println("3. Checkout book");
            System.out.println("4. return book");
            System.out.println();
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

        
            if (choice == 1) {
                book.findBook();
            } else if (choice == 2) {
                book.addBook();
            } else if (choice == 3) {

            } else if (choice == 4) {

            } else {
                System.out.println("Invalid option, please try again");
            }
        }
    }

    // public static void addBooks() {
    //     Scanner scanner = new Scanner(System.in);
    //     String title;
    //     System.out.println("Enter book title: ");
    //     title = scanner.nextLine();
    //     ArrayList<Book> books = new ArrayList<>();
    //     books.add(new Book("null"));
    // }
    
    public void checkOutBook() {

    }

    public void returnBook() {

    }
}