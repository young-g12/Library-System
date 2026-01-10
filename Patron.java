import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patron extends Book{
    private String name;
    private String bookTitle;
    ArrayList<Patron> patrons = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<String> checkedOutBooks = new ArrayList<>();
    Book book = new Book();
    Scanner scanner = new Scanner(System.in);

    public Patron() {

    }

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 

    public void addBook(String title) {
        checkedOutBooks.add(title);
    }

    public List<String> getCheckedOutBooks() {
        return checkedOutBooks;
    }

     @Override 
    public String toString(){
        return this.name;
    }

    public void createPatron() throws IOException {
        System.out.println("Enter name: ");
        name = scanner.nextLine();

        for (Patron p : patrons) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Name of Patron already exist in system");
                return;
            }
        }

        Patron patron = new Patron(name);
        patrons.add(patron);
        System.out.println(patron + " was added");
        
        System.out.println("Would you like to checkout Books(y/n): ");
        String input = scanner.nextLine();
      
        if (input.equalsIgnoreCase("y")) {
            System.out.println("Enter book title: ");
            String title = scanner.nextLine();

            patron.addBook(title);
        }

        
        System.out.println(name + " checked out " + title);

        }

       public void searchPatrons() {
    System.out.println("Enter name: ");
    String name = scanner.nextLine();

    for (Patron p : patrons) {
        if (p.getName().equalsIgnoreCase(name)) {
            System.out.println(p.getName() + " has checked out:");

            if (p.getCheckedOutBooks().isEmpty()) {
                System.out.println("No books");
            } else {
                for (String book : p.getCheckedOutBooks()) {
                    System.out.println("- " + book);
                }
            }
            return;
        }
    }
        
        System.out.println("Patron not found");
    }


    }
