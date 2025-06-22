package Day15_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinarySearch searcher = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 45, 6, 7, 6 };
        Arrays.sort(numbers);
        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("which number are you searching for");
        int input = scanner.nextInt();
        String result = searcher.binarySearch(numbers, input);
        System.out.println(result);
        scanner.close();
    }
}
