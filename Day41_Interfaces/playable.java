public interface playable {
    // abstract method(no body)
    void play();

    void pause();

    // default method(has body)
    default void greet() {
        System.out.println("i'm the default method");
    }

    // static method
    static void staticGreet() {
        System.out.println("hello from the static method");
    }
}