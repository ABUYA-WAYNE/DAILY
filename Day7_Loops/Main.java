package Day7_Loops;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int num = 0;

        System.out.println("while LOOP");
        while (num < 10) {
            num++;
            System.out.println(num);
            count = count + 1;
        }

        System.out.println();
        System.out.println("FOR LOOP");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("FOR each LOOP");
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int nm : numbers) {
            System.out.println(nm);
        }
    }
}
