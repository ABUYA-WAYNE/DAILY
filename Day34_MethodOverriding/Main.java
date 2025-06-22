public class Main {
    public static void main(String[] args) {
        Animal generic = new Animal();
        dog jay = new dog();
        Animal polymorphicAnimal= new dog();
        generic.eat();
        jay.eat();
        polymorphicAnimal.eat();

    }
}
