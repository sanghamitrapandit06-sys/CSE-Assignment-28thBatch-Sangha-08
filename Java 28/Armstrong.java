public class Armstrong {
    public static void main(String[] args) {

        int num = 153; // Original number
        int original = num; // Store original number
        int sum = 0; // Store sum of digits

        while (num > 0) {
            int digit = num % 10; // Get last digit
            sum = sum + (digit * digit * digit); // Cube the digit and add
            num = num / 10; // Remove last digit
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
