public class Fact {
    public static void main(String[] args) {

        int num = 5; // Number to find factorial
        int fact = 1; // Initialize factorial

        for (int i = 1; i <= num; i++) {
            fact = fact * i; // Calculate factorial
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
