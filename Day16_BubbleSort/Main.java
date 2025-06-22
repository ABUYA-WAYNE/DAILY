package Day16_BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 8, 967, 4, 67, 78886, 5, 68, 4, 51 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temporary = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporary;
                }
            }
        }
        System.out.print("Sorted array: [");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");




    }
}
