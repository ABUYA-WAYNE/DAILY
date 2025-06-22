public class RandomLooperThread extends Thread {
    private RandomLooper looper;

    public RandomLooperThread(RandomLooper looper) {
        this.looper = looper;
    }

    @Override
    public void run() {
        looper.loop();
    }
}
