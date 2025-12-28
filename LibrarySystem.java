import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) throws IOException, WrongInputException {
        Book book = new Book();
        Patron p  = new Patron();
        // ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Library System ");
            System.out.println("1. Search Book by title");
            System.out.println("2. Add book");
            System.out.println("3. Checkout book");
            System.out.println("4. return book");
            System.out.println("5. Display books in system");
            System.out.println();
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            //ends program
            if (choice ==0) {
                System.out.println("Exiting Library System");
                break;
            }

            if (choice == 1) {
                book.findBook();
            } else if (choice == 2) {
                book.addBook();
            } else if (choice == 3) {
                book.checkOutBook();
                // p.limitsBooks();
            } else if (choice == 4) {
                book.returnBook();
            } else if(choice == 5) {
                book.displayAllBooks();
            } else {
                System.out.println("Invalid option, please try again");
            }
        }
    }
}