public class Prime{
    public static void main(String[] args) {

        int num = 17; // Number to check
        boolean isPrime = true; // Assume number is prime

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Number is divisible
                    break;
                }
            }
        }}
