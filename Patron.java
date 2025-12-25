import java.util.ArrayList;
import java.util.Scanner;

public class Patron {
    private String name;
    private int numOfBooksCheckedOut;
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Patron() {

    }

    public String getName() {
        return name;
    } 


    public void limitsBooks() {
        int j = 0;
        while (books.size() < 3) {
            
            System.out.println("Enter book you'd like to check out: ");
            String title = scanner.nextLine();

            boolean found = false;
        
            for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
                if (b.getTitle().equalsIgnoreCase(title)) {
                    books.remove(i);
                    System.out.println(title + " has been checked out.");
                    found = true;
                    j--;
                    break;
                }
            } 

            if (!found) {
                System.out.println("Book is not available.");
            }
        } 
                System.out.println("Sorry, you can no longer checkout a book");
                System.out.println("You may return one or more in order to continue checkout");
        
    }
}
