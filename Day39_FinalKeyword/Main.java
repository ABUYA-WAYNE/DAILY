package Day39_FinalKeyword;

public class Main {

    public static class Demo {
        final int candles = 1;

        void candy() {
            System.out.print("candles: " + candles);
        }

        public static void main(String[] args) {
            Demo okay = new Demo(); // 'okay' is an instance of Demo
            okay.candy();
        }
    }
}
