
public class PizzaBox {

    private String pizza;
    private boolean isEmpty = true;

    public synchronized void put(String pizza) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pizza = pizza;
        isEmpty = false;
        System.out.println("produced: " + pizza);
        notify();
    }

    public synchronized String take() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        System.out.println("consumed: " + pizza);
        notify();
        return pizza;
    }

}
