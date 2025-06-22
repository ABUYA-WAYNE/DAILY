package Day20_StringBuilder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name? ");
        String name = scanner.nextLine();
        StringBuilder sb = new StringBuilder("how are you " + name);
        System.out.println((sb.append(" Where are you going at this hour")));
        sb.insert(14, " ,");
        sb.replace(2, 7, "tyuiotryui");
        sb.delete(3, 9);
        System.out.println(sb.reverse());
        scanner.close();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            result.append(i).append(" ");
        }

        System.out.println(result.toString());
    }
}
