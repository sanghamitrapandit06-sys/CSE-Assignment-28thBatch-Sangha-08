public class FbS {
    public static void main(String[] args) {

        int n = 10; // Number of terms
        int first = 0, second = 1; // First two numbers

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print current number

            int next = first + second; // Calculate next number
            first = second; // Update first number
            second = next; // Update second number
        }
    }
}
