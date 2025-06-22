package Day45_CollectionsIntro;

public class Main {

    public static void main(String[] args) {
        arrayList fruits = new arrayList();
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("enter elements...\ntype 'done' when done");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                fruits.add(input);

            }
        }

        fruits.get(0);
        fruits.remove(8);
        fruits.set(2, "wayne");
        fruits.contains("hey");
        fruits.clear();
    }
}
