
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hello.\nChoose file to read");
        String fileName = scan.nextLine();
        // write to file efficiently 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("🌟✅ BufferedWriter is super fast!");
            writer.newLine();  // Writes a new line
            writer.write("It's great for large files.");
            writer.newLine();
            writer.write("End of buffered write.");
            System.out.println("✅ Written successfully using BufferedWriter.\n");
        } catch (IOException e) {
            System.out.println("ERROR WHILE WRITING TO FILE");
            e.printStackTrace();
        }

        //READ FROM FILE EFFICIENTLY
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading contents using bufferedReader:\n");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error while reading");
            e.printStackTrace();
        }
    }

}
