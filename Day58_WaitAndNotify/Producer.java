
public class Producer extends Thread {

    private PizzaBox box;

    public Producer(PizzaBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            box.put("Pizza #" + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
