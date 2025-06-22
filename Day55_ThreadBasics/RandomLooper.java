
public class RandomLooper {

    private int start;
    private int end;
    private int interval;
    private int count = 0;

    public RandomLooper(int start, int end, int interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    public void loop() {
        for (int i = start; i > end; i -= interval) {
            count++;
            System.out.print("\r" + i);
            // System.out.println("Count: " + count);
            try {
                Thread.sleep(1000); // Delay for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
                break;
            }
        }
    }
}
