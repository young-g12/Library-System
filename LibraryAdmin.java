import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryAdmin {
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
    private int password;
    private int passwordAttempts = 0;

    public LibraryAdmin() {

    }

    public void adminLogin() throws IOException, WrongInputException {
        while (passwordAttempts <= 3) {
                System.out.println("Enter password: ");
                password = scanner.nextInt();
            if (password == 112358) {
              displayAdminCommands();
            } else {
                  System.out.println("incorrect attempt");
            }
            passwordAttempts++;
        }
        System.out.println("Unable to access Admin...Try again later");
        endProgram();
    }

    public void displayAdminCommands() throws IOException, WrongInputException {
        
        while (true) {
            System.out.println("0. Exit program");
            System.out.println("1. Search Book by Title");
            System.out.println("2. Display Books in System");
            System.out.println("3. Add Books to Library");
            System.out.println("4. Patron Portal");
            System.out.println();
            System.out.println("Select command: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 0 -> endProgram();
                case 1 -> book.findBook();
                case 2 -> book.displayAllBooks();
                case 3 -> book.addBook();
                case 4 -> MainMenu();
                default -> System.out.println("Invalid option, please try again");
            }
        }
    }

    private Object MainMenu() throws WrongInputException, IOException {
        Book book = new Book();
        Patron p = new Patron();
        LibraryAdmin admin = new LibraryAdmin();
        Scanner scanner = new Scanner(System.in);
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
