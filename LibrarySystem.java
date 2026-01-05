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
        ArrayList<Patron> pat = new ArrayList<>();
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

             if (choice < 0 || choice > 6) {
                throw new WrongInputException();
            }

            switch (choice) {
                case 0 -> endProgram();
                //for library staff
                case 1 -> book.findBook();
                case 5 -> book.displayAllBooks();

                // for patrons
                case 6 -> p.createPatron();
                case 2 -> book.addBook();
                case 3 -> book.checkOutBook();
                case 4 -> book.returnBook();
                
                
                default -> System.out.println("Invalid option, please try again");
            }
        
        }
    }

    public static void endProgram() {
            System.out.println("Exiting Library System...");
            System.exit(0);
    }

    public static void displayPatrons() {
        //will display patron's name with books they have cheecked
    }
}