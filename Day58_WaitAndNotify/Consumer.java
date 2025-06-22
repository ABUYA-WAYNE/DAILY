
public class Consumer extends Thread {

    private PizzaBox box;

    public Consumer(PizzaBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            String pizza = box.take();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
