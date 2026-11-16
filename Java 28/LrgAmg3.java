public class LrgAmg3 {
    public static void main(String[] args) {

        int a = 50; // First number
        int b = 30; // Second number
        int c = 70; // Third number

        if (a >= b && a >= c) {
            System.out.println(a + " is the Largest Number");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is the Largest Number");
        }
        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}
