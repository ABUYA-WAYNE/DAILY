package Day22_MethodOverloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Area of square (side 5): " + Calculations.area(5.0));
        System.out.println("Area of rectangle (4 x 6): " + Calculations.area(4.0, 6.0));
        System.out.println("Area of circle (radius 3): " + Calculations.area(3));
    }
}