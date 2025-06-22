
import java.io.*;

public class DeserializeDemo {

    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("student.ser"); // Open the file containing serialized object
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Student s = (Student) in.readObject();
            System.out.println("object has been deserialized");
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("an error happened");
            e.printStackTrace();
        }
    }
}
