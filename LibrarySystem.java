import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LibrarySystem {
    /**
     * @param args
     * @throws IOException
     * @throws WrongInputException
     */
    public static void main(String[] args) throws IOException, WrongInputException {
        Book book = new Book();
        Patron p  = new Patron();
        // ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Library System ");
        
        while (true) {
            
            System.out.println("1. Search Book by title");
            System.out.println("2. Add book");
            System.out.println("3. Checkout book");
            System.out.println("4. return book");
            System.out.println("5. Display books in system");
            System.out.println();
            System.out.print("Enter choice: ");
            int choice;
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                continue;
            }

             if (choice < 0 || choice > 5) {
                throw new WrongInputException();
            }

            //ends program
            // if (choice ==0) {
            //     System.out.println("Exiting Library System");
            //     break;
            // }

            // if (choice == 1) {
            //     book.findBook();
            // } else if (choice == 2) {
            //     book.addBook();
            // } else if (choice == 3) {
            //     book.checkOutBook();
            //     // p.limitsBooks();
            // } else if (choice == 4) {
            //     book.returnBook();
            // } else if(choice == 5) {
            //     book.displayAllBooks();
            // } else {
            //     System.out.println("Invalid option, please try again");
            // }

            switch (choice) {
                case 0 -> endProgram();
                case 1 -> book.findBook();
                case 2 -> book.addBook();
                case 3 -> book.checkOutBook();
                case 4 -> book.returnBook();
                case 5 -> book.displayAllBooks();
                default -> System.out.println("Invalid iption, please try again");
            }
        
        }
    }

    public static void endProgram() {
            System.out.println("Exiting Library System...");
            System.exit(0);
    }
}