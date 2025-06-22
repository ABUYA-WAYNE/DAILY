public class Work {
    String task;
    int hours;

    // default constructors
    public Work() {
        task = "cleaning";
        hours = 8;
    }

    // parameterize constructor
    public Work(String task, int hours) {
        this.task = task; // correct assignment
        this.hours = hours;
    }

    public void displayInfo() {
        System.out.println("work " + task + "\n hours: " + hours);
    }
}
