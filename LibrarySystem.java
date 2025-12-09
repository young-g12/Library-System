import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) throws FileNotFoundException {
        Book book = new Book();
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
                book.findBook(new Book());
            } else if (choice == 2) {
                book.addBook();
            } else if (choice == 3) {
                
            } else if (choice == 4) {

            } else {
                System.out.println("Invalid option, please try again");
            }

        }
    }
    public void checkOutBook() {

    }

    public void returnBook() {

    }
}