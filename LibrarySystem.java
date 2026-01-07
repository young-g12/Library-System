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
        LibraryAdmin admin = new LibraryAdmin();
        Patron p  = new Patron();
        ArrayList<Patron> patrons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Admin(1) or User(2)");
        int input;
        input = scanner.nextInt();
        if (input == 1) {
            admin.adminLogin();
        } else {

        }
        

        System.out.println("---Welcome to Library System---");
        
        while (true) {
            
            System.out.println("1. Search Book by Title");
            System.out.println("2. Add Books");
            
            System.out.println("3. Checkout Books");
            System.out.println("4. Return book");
            System.out.println("5. Display Books in System");
            System.out.println("6. Create Patron Book Log");
            System.out.println("7. Display Patrons in system");
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

             if (choice < 0 || choice > 7) {
                throw new WrongInputException();
            }

            switch (choice) {
                case 0 -> endProgram();
                //for library staff
                case 1 -> book.findBook();
                case 5 -> book.displayAllBooks();
                case 2 -> book.addBook();

                // for patrons
                case 6 -> p.createPatron();
                case 3 -> book.checkOutBook();
                case 4 -> book.returnBook();
                case 7 -> p.searchPatrons();
                
                
                default -> System.out.println("Invalid option, please try again");
            }
        
        }
    }

    public static void endProgram() {
            System.out.println("Exiting Library System...");
            System.exit(0);
    }
}