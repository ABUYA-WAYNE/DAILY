package DynamicDispatch.java;

public class Main {
    public static void main(String[] args) {
        // Polymorphic array of Shape references
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape s : shapes) {
            s.draw(); // Dynamic dispatch happens here ✅
        }
    }
}
