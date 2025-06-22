package Day14_LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinearSearch searcher = new LinearSearch();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("input your search: ");
        int target = scanner.nextInt();
        int result = searcher.search(numbers, target);
        if (result != -1) {
            System.out.println("found aat index: " + result);
        } else {
            System.out.println("not found!!!");
        }
        System.out.println(searcher.biggest(numbers));
        scanner.close();
    }
}