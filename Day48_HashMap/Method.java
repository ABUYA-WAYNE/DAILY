
import java.util.HashMap;

public class Method {

    HashMap<String, Integer> grades = new HashMap<>();

    public void add(String name, int marks) {
        grades.put(name, marks);
        System.out.println("added successfully");
    }

    public void retrieve(String key) {

        System.out.println("value at key " + key + " is " + grades.get(key));
    }

    public void remove(String key) {
        grades.remove(key);
        System.out.println(key + " has been removed from the hash map");
    }

    public boolean contains(String key) {
        System.out.print("key present: ");
        return grades.containsKey(key);
    }

    public void keySet() {//gets all keys
        grades.keySet();
    }

    public void getValues() {//gets all values
        grades.values();
    }

    public void size() {
        grades.size();
    }

    public void clear() {//empties a hash map
        grades.clear();
    }

    public boolean checkIfEmpty() {
        return grades.isEmpty();
    }
}
