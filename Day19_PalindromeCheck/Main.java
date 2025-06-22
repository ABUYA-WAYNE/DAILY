package Day19_PalindromeCheck;

public class Main {

    public static void main(String[] args) {
        String text = "madam";
        System.out.println("Is palindrome? " + isPalindrome(text));
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
