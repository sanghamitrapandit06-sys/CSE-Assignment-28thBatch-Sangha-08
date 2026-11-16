public class ShiftOperator {
    public static void main(String[] args) {

        int num = 8; // Original number

        int leftShift = num << 2; // Left shift by 2 bits
        int rightShift = num >> 2; // Right shift by 2 bits

        System.out.println("Original Number: " + num);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
    }
}
