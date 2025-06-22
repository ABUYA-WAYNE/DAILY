public class Consumer extends Thread {
    private Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { // Consume 5 apples
            basket.takeApple();
            try {
                Thread.sleep(1000); // Simulate eating time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
   public Consumer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { // Consume 5 apples
            basket.takeApple();
            try {
                Thread.sleep(1000); // Simulate eating time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
   public Consumer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (int i = 0; i < 5; i++) { // Consume 5 apples
            basket.takeApple();
            try {
                Thread.sleep(1000); // Simulate eating time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
