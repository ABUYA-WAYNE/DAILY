public class Person {
    private String name;

    // Constructor for Person
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Comparison method for sorting
    public int compareByName(Person other) {
        return this.name.compareTo(other.name);
    }
}
