import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "output.txt";
        File file = new File(fileName);
        Scanner inputScanner = new Scanner(System.in);  // For user input

        // Step 1: Get user input and append to file
        try (FileWriter writer = new FileWriter(fileName, true)) { // true = append mode
            System.out.print("✍️ Enter a message to add to the file: ");
            String userMessage = inputScanner.nextLine();

            writer.write(userMessage + "\n");
            System.out.println("✅ Message appended successfully.\n");
        } catch (IOException e) {
            System.out.println("❌ Error while writing to file:");
            e.printStackTrace();
        }

        // Step 2: Read file and count lines
        try (Scanner reader = new Scanner(file)) {
            System.out.println("📄 File contents:\n------------------");
            int lineCount = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
                lineCount++;
            }

            System.out.println("------------------");
            System.out.println("📏 Total number of lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found during reading!");
            e.printStackTrace();
        }

        inputScanner.close(); // Close the Scanner used for user input
    }
}
