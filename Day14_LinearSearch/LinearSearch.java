package Day14_LinearSearch;

public class LinearSearch {
    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public String biggest(int[] arr) {
        int biggestIndex = 0;
        for (int i = 1; i < arr.length; i++) {// this itterates over the entire array

            if (arr[i] > arr[biggestIndex]) {
                biggestIndex = i;
            }
        }
        return arr[biggestIndex] + " is the bigest number";
    }
}