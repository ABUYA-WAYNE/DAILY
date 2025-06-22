package Day45_CollectionsIntro;

import java.util.ArrayList;

public class arrayList {

    ArrayList<Object> fruits = new ArrayList<>();

    public void add(Object o) {
        fruits.add(o);
        System.out.println(o + " added");
    }

    public void get(int index) {
        if (index >= 0 && index < fruits.size()) {
            System.out.println("Element at index " + index + " is: " + fruits.get(index));
        } else {
            System.out.println("index out of bounds!");
        }

    }

    public void set(int index, Object element) {
        if (index >= 0 && index < fruits.size()) {
            fruits.set(index, element);
            System.out.println("Element at index " + index + " is set to: " + element);
        } else {
            System.out.println("index out of bounds!");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < fruits.size()) {
            fruits.remove(index);
            System.out.println("element at " + index + " has been removed from the array list"
            );
        } else {
            System.out.println("index out of bounds!");
        }

    }

    public void clear() {
        fruits.clear();
        System.out.println("Array list has been cleared");
    }

    public void contains(Object searchTerm) {
        int index = fruits.indexOf(searchTerm);
        if (index != -1) {
            System.out.println(searchTerm + " is present at index: " + index);
        } else {
            System.out.println(searchTerm + " is not present in the array");
        }
    }
}
