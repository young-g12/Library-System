import java.util.Scanner;

public class LibraryAdmin {
    Scanner scanner = new Scanner(System.in);
    private int password;
    private int passwordAttempts = 0;

    public LibraryAdmin() {

    }

    public void adminLogin() {
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
    }

    public void displayAdminCommands() {
        while (true) {
            System.out.println("1. Search Book by Title");
            System.out.println("2. Add Books");
        }
    }
}
