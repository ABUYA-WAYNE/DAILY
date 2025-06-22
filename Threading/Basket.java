// Shared resource: a basket that can only hold one apple at a time
public class Basket {
    private boolean hasApple = false; // Tracks if basket is full (true) or empty (false)

    // Producer tries to put an apple
    public synchronized void putApple() {
        // If basket is full, wait
        while (hasApple) {
            try {
                System.out.println("Basket full. Producer waits.");
                wait(); // Releases the lock and pauses
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Put apple in the basket
        hasApple = true;
        System.out.println("Producer placed an apple 🍎 in the basket.");

        notify(); // Wake up consumer if waiting
    }

    // Consumer tries to take an apple
    public synchronized void takeApple() {
        // If basket is empty, wait
        while (!hasApple) {
            try {
                System.out.println("Basket empty. Consumer waits.");
                wait(); // Releases the lock and pauses
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Take apple from the basket
        hasApple = false;
        System.out.println("Consumer took the apple 🍎 from the basket.");

        notify(); // Wake up producer if waiting
    }
}
