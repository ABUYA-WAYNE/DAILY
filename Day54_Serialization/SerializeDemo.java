
import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) {
        Student s = new Student("wayne", 25);
        try (FileOutputStream fileOut = new FileOutputStream("student.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(s);
            System.out.println("object has been serialized");
        } catch (IOException e) {
            System.out.println("an error happened");
            e.printStackTrace();
        }
    }

}
