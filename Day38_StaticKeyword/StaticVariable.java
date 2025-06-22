public class StaticVariable {
    static int count = 0; // shared among all objects

    StaticVariable() {
        count++;
        System.out.println("Object Created. Total objects: " + count);
    }
}
