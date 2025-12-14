import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String[] args) throws IOException, WrongInputException {
        Book book = new Book();
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

        if (choice ==0) {
            break;
        }
            if (choice == 1) {
                book.findBook(book);
            } else if (choice == 2) {
                book.addBook();
                //Allows user to checkout up to 3 books
            } else if (choice == 3) {
                int i = 0;
                while (i <= 3) {
                    if (choice == 0) {
                        // book.displayAllBooks();
                        break;
                    } else {
                        book.checkOutBook();
                    }
                    //keeps track of books 
                    i++;
                } 
                System.out.println("Cannot check out any more books");
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