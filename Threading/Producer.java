public class Producer extends Thread {
    private Basket basket;

    public Producer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { // Produce 5 apples
            basket.putApple();
            try {
                Thread.sleep(500); // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
