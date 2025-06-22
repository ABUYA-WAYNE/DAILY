// package Day42_MultipleInheritance;

public class Robot implements Movable, Soundable {

    @Override
    public void move() {
        System.out.println("Robot is moving forward.");
    }

    @Override
    public void makeSound() {
        System.out.println("Robot is making a beep sound.");
    }
}
