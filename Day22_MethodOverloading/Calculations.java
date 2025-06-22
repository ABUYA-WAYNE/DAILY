package Day22_MethodOverloading;

public class Calculations {
    // Area of a square
    public static double area(double side) {
        return side * side;
    }

    // Area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Area of a circle
    public static double area(int radius) {
        return Math.PI * radius * radius;
    }
}