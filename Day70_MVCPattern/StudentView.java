// package Day70_MVCPattern;

public class StudentView implements StudentObserver {
    @Override
    public void update(String name, int age) {
        System.out.println("\n📺 VIEW UPDATED:");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
