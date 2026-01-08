import java.io.IOException;
import java.util.Scanner;

public class LibraryAdmin {
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
    private int password;
    private int passwordAttempts = 0;

    public LibraryAdmin() {

    }

    public void adminLogin() throws IOException {
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

    public void displayAdminCommands() throws IOException {
        
        while (true) {
            System.out.println("0. Exit program");
            System.out.println("1. Search Book by Title");
            System.out.println("2. Display Books in System");
            System.out.println("3. Add Books to Library");
            System.out.println("Select command: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 0 -> endProgram();
                case 1 -> book.findBook();
                case 2 -> book.displayAllBooks();
                case 3 -> book.addBook();
                default -> System.out.println("Invalid option, please try again");
            }
        }
    }

    public static void endProgram() {
            System.out.println("Exiting Library System...");
            System.exit(0);
    }
}
