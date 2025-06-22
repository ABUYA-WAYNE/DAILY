package Day21_Methods;

public class Kain {

    // Method to find the maximum value in a double array
    public static double find(double[] numbers) {
        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
