import java.util.ArrayList;
import java.util.Scanner;

public class Patron {
    private String name;
    private String bookTitle;
    Scanner scanner = new Scanner(System.in);

    public Patron() {

    }

    public String getName() {
        return name;
    } 

    public String createPatron() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }
   
    }
