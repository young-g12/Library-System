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

            System.out.println("0. Exit Program");
            System.out.println("1. Checkout Books");
            System.out.println("2. Return book");
            System.out.println("3. Display Books in System");
            System.out.println("4. Create Patron Book Log");
            System.out.println("5. Display Patrons in system");
            System.out.println("6. Admin Portal");
            System.out.println();
            System.out.print("Select command: ");
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
                case 1 -> book.checkOutBook();
                case 2 -> book.returnBook();
                case 3 -> book.displayAllBooks();
                case 4 -> p.createPatron();
                case 5 -> p.searchPatrons();
                case 6 -> admin.adminLogin();
                default -> System.out.println("Invalid option, please try again");
            }
        
        }
    }

    public static void endProgram() {
            System.out.println("Exiting Library System...");
            System.exit(0);
    }

}