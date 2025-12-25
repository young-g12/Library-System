import java.util.ArrayList;

public class Patron {
    private String name;
    private int numOfBooksCheckedOut;
    ArrayList<Book> books = new ArrayList<>();

    public Patron() {

    }

    public String getName() {
        return name;
    }


    public void limitsBooks() {
        if (books.size() == 3) {
            System.out.println("Sorry, you can no longer checkout a book");
            System.out.println("You may return one or more in order to continue checkout");
        }
    }

}
