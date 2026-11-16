public class Gcd {
    public static void main(String[] args) {

        int a = 24; // First number
        int b = 36; // Second number
        int gcd = 1; // Store GCD

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Update GCD
            }
        }

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}
