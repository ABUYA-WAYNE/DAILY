import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // 1. Reference to a static method: Util::shout
        Consumer<String> shout = Util::shout;
        shout.accept("danger"); // Outputs: DANGER!!!

        // 2. Reference to an instance method of a specific object: greeter::sayHello
        Greeter greeter = new Greeter();
        GreetingService greet1 = (name) -> greeter.sayHello(name); // Lambda
        GreetingService greet2 = greeter::sayHello; // Method reference
        greet1.greet("Alice");
        greet2.greet("Bob");

        // 3. Reference to an instance method of an arbitrary object of a particular type: Person::compareByName
        List<Person> people = Arrays.asList(new Person("Zara"), new Person("Adam"), new Person("John"));
        people.sort(Person::compareByName); // Equivalent to: (p1, p2) -> p1.compareByName(p2)
        System.out.println("Sorted by name:");
        for (Person p : people) {
            System.out.println(p.getName());
        }

        // 4. Reference to a constructor: Person::new
        PersonFactory factory = Person::new; // () -> new Person()
        Person newPerson = factory.create("Charlie");
        System.out.println("New person: " + newPerson.getName());
    }
}
