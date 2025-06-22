import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("START:");
        int start = scan.nextInt();

        System.out.print("END:");
        int end = scan.nextInt();

        System.out.print("INTERVAL:");
        int interval = scan.nextInt();

        // Create the logic handler
        RandomLooper looper = new RandomLooper(start, end, interval);

        // Create the thread object and start it
        RandomLooperThread thread = new RandomLooperThread(looper);
        thread.start();
    }
}
