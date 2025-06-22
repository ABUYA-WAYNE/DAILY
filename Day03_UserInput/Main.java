package Day03_UserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        System.out.println("its nice to finally meet you " + scanner.nextLine());
        scanner.close();
    }
}
