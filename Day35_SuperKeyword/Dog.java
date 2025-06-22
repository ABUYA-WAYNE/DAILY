public class Dog extends Animal {
    String type = "Dog";

    public Dog() {
        super();
        System.out.println("dog constructor called");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("dogs eat meat");
    }

    public void printTypes() {
        System.out.println("child type: " + type);
        System.out.println("parent type: " + super.type);
    }
}
