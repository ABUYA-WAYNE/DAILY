public class jj {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println();
               for (int s = 10 - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
        }
    }
}
