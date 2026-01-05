import java.util.ArrayList;
import java.util.Scanner;

public class Patron extends Book{
    private String name;
    private String bookTitle;
    ArrayList<Patron> patrons = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Patron() {

    }

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 

     @Override 
    public String toString(){
        return this.name;
    }

    public void createPatron() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Patron nameOf = new Patron(name);
        patrons.add(nameOf);

        System.out.println(nameOf + " was added");
        }

        public static void searchPatrons() {
        ArrayList<Patron> patrons = new ArrayList<>();
        //will display patron's name with books they have cheecked
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("---List of Patrons---");
        for (Patron p : patrons) {
            if (p.getTitle().equalsIgnoreCase(name)) {
                System.out.println("Patron found");
                return;
            }
        }
        System.out.println("Patron not found");
    }


    }
