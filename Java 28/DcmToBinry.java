public class DcmToBinry {
    public static void main(String[] args) {

        int num = 25; // Decimal number
        int original = num; // Store original number
        int binary = 0; // Store binary number
        int place = 1; // Position value

        while (num > 0) {
            int remainder = num % 2; // Get remainder
            binary = binary + remainder * place; // Build binary number
            num = num / 2; // Divide by 2
            place = place * 10; // Update position
        }

        System.out.println("Binary of " + original + " is: " + binary);
    }
}
