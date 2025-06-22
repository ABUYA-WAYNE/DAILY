public class Employee {
    String name;
    int id;
    int salary;

    public Employee() {
        name = "Rot";
        id = 53;
        salary = 1000000;
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
