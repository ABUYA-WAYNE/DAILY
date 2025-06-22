public class PersonDemo {
    private String name;
    private int age;

    // constructor
    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
