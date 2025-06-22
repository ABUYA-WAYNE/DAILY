public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.printf("%.2f", calc.add(4.4, 8.3));
    }
}
