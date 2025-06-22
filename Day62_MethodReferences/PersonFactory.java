@FunctionalInterface
public interface PersonFactory {
    // Constructor reference will use this
    Person create(String name);
}
