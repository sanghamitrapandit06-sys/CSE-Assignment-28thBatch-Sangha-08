public class SmpleCal {
    public static void main(String[] args) {

        int a = 20; // First number
        int b = 10; // Second number
        char operator = '+'; // Operator

        switch (operator) {

            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                System.out.println("Division: " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
