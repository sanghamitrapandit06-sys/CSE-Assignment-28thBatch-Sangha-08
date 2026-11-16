public class Lcm {
    public static void main(String[] args) {

        int a = 12; // First number
        int b = 18; // Second number
        int lcm = (a > b) ? a : b; // Start from larger number

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break; // LCM found
            }
            lcm++; // Check next number
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
