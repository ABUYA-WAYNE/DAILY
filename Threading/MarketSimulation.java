public class MarketSimulation {
    public static void main(String[] args) {
        Basket sharedBasket = new Basket(); // Shared between producer and consumer

        Producer producer = new Producer(sharedBasket);
        Consumer consumer = new Consumer(sharedBasket);

        producer.start(); // Starts producing
        consumer.start(); // Starts consuming
    }
}
