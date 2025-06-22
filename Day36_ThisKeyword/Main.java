// File: Main.java
public class Main {
    public static void main(String[] args) {
        MethodChaining w = new MethodChaining();

        Student s = new Student("Wayne", 22);
        s.display();

        // Method chaining using this
        s.updateName("Boss Wayne").updateAge(30);
        s.display();

        w.setT(21).showT();
    }
}
