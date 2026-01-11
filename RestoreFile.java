// name of accounts created w/ books users have checked out 

//list of books in system

//list of books checked out 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class RestoreFile {
    Scanner scanner = new Scanner(System.in);

    public void restore() {

        System.out.println("Enter file name to restore previous session: ");
         String fileName = scanner.nextLine(); // Replace with your file name

         if (isFileEmpty(fileName)) {
            System.out.println("The file is empty");
         }
        System.out.println("--All books in System--");

        // Use a try-with-resources statement to ensure the reader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read the file line by line until a null is returned (end of file)
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle exceptions, such as the file not being found
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * @param fileName
     * @return
     */
    public static boolean isFileEmpty(String fileName) {

        if (!Files.exists(fileName)) {
            System.out.println("File does not exist.");
            return true;
        }
        return false;
    }
}