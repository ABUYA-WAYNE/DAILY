package DAY44_TYPECASTING;
public class TypeCasting {

    public void wideningCasting() {
        int intU = 10;
        double doubleU = intU;
        System.out.println("widening casting(int to double): " + doubleU);
    }

    public void narrowingCasting() {
        double u = 7.9;
        int intU = (int) u;
        System.out.println("narrowing casting (double): " + intU);
    }

    // public void objectCasting() {
    //     Animal a = new Dog();
    //     a.sound();

    //     Dog f = (Dog) a;
    //     f.bark();
    // }
}
