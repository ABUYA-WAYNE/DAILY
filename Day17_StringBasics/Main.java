package Day17_StringBasics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name? ");
        String name = scanner.nextLine();
        System.out.println("how old are you? ");
        String age = scanner.nextLine();
        System.out.println(name + " what are plans with my daughter");
        String plans = scanner.nextLine();
        System.out.println("number of characters is:" + plans.length());
        System.out.println("at " + age + " i was hunting with my brothers and not chasing girls");
        scanner.close();
    }
}
