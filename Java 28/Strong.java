public class Strong {
    public static void main(String[] args) {

        int num = 145; // Original number
        int original = num; // Store original number
        int sum = 0; // Store sum of factorials

        while (num > 0) {
            int digit = num % 10; // Get last digit
            int fact = 1; // Initialize factorial

            for (int i = 1; i <= digit; i++) {
                fact = fact * i; // Calculate factorial
            }

            sum = sum + fact; // Add factorial to sum
            num = num / 10; // Remove last digit
        }

        if (original == sum) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is not a Strong Number");
        }
    }
}
