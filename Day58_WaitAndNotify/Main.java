
public class Main {

    public static void main(String[] args) {
        PizzaBox box = new PizzaBox();
        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);

        producer.start();
        consumer.start();
    }
}
