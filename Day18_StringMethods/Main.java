package Day18_StringMethods;

public class Main {

    public static void main(String[] args) {
        // 1. Creating Strings
        String literal = "Java";
        String object = new String("Java");
        System.out.println(".(literal+object)");
        // 2. String Immutability
        String original = "Hello";
        original.concat(" World");
        System.out.println("Immutability: " + original); // Hello

        // 3. Common Methods
        String s = "Java Programming";

        System.out.println("Length: " + s.length());
        System.out.println("CharAt(2): " + s.charAt(2));
        System.out.println("Substring(5): " + s.substring(5));
        System.out.println("Contains 'Pro': " + s.contains("Pro"));
        System.out.println("Equals 'java programming': " + s.equals("java programming"));
        System.out.println("EqualsIgnoreCase: " + s.equalsIgnoreCase("java programming"));
        System.out.println("CompareTo 'Java': " + s.compareTo("Java"));
        System.out.println("IndexOf 'a': " + s.indexOf('a'));
        System.out.println("LastIndexOf 'a': " + s.lastIndexOf('a'));
        System.out.println("ToLowerCase: " + s.toLowerCase());
        System.out.println("ToUpperCase: " + s.toUpperCase());
        System.out.println("Trim: '" + "  trimmed  ".trim() + "'");
        System.out.println("Replace 'a' with '@': " + s.replace('a', '@'));

        String[] parts = s.split(" ");
        System.out.println("Split:");
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println("StartsWith 'Java': " + s.startsWith("Java"));
        System.out.println("EndsWith 'ing': " + s.endsWith("ing"));

        // 4. String Comparison
        String a = "Java";
        String b = new String("Java");
        System.out.println("== Comparison: " + (a == b)); // false
        System.out.println("equals Comparison: " + a.equals(b)); // true

        // 5. StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Builder");
        System.out.println("StringBuilder: " + sb);

        // 6. StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Buffer");
        System.out.println("StringBuffer: " + sbf);

        // 7. Formatting
        String name = "Alice";
        int age = 30;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 8. Regular Expressions
        String email = "test@example.com";
        System.out.println("Valid Email: " + email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"));

        // 9. Conversions
        int num = Integer.parseInt("123");
        String strNum = String.valueOf(456);
        System.out.println("Parsed int: " + num);
        System.out.println("String from int: " + strNum);

        // 10. Java 11+ methods (Only work in Java 11+)
        String blank = "   ";
        String multiLine = "Line1\nLine2\nLine3";

        System.out.println("isBlank(): " + blank.isBlank());
        System.out.println("repeat(3): " + "Echo ".repeat(3));
        System.out.println("strip(): '" + "  hello  ".strip() + "'");

        System.out.println("lines():");
        multiLine.lines().forEach(System.out::println);
    }
}
