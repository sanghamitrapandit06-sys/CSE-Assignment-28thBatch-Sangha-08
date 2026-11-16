
public class Palindrome {
    public static void main(String[] args) {

        int num = 121; // Original number
        int original = num; // Store original number
        int reverse = 0; // Store reversed number

        while (num > 0) {
            int digit = num % 10; // Get last digit
            reverse = reverse * 10 + digit; // Reverse the number
            num = num / 10; // Remove last digit
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}