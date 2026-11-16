public class NumOfSwap {
    public static void main(String[] args) {

        int a = 10; // First number
        int b = 20; // Second number

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a; // Store value of a
        a = b; // Assign b to a
        b = temp; // Assign old a to b

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
