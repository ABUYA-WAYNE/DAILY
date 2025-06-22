package Day37_Encapsulation;

public class Person {
    private String name;
    private int age;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }
    }

    public int getAge() {
        return age;
    }
}
