
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File myFile = new File("example.txt");
        try {
            Scanner fileScan = new Scanner(myFile);
            int lineNo = 1;
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                System.out.println("Line " + lineNo + ": " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

