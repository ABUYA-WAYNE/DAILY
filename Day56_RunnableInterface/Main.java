public class Main {
    public static void main(String[] args) {
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

        Thread t1 = new Thread(task1); // Wrap Runnable in Thread
        Thread t2 = new Thread(task2); // Create another thread

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}