package Day37_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("wayne");
        person.setAge(25);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
