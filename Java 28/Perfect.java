public class Perfect {
    public static void main(String[] args) {

        int num = 28; // Number to check
        int sum = 0; // Store sum of divisors

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i; // Add divisor to sum
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}
