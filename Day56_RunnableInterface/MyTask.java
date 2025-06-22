
public class MyTask implements Runnable {

    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.print("\r" + i);
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println("SOMETHING INTERRUPTED");
            }
        }
    }
}
