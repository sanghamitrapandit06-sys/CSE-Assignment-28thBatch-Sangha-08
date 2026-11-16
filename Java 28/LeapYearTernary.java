public class LeapYearTernary {
    public static void main(String[] args) {

        int year = 2024; // Year to check

        String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                ? "Leap Year" : "Not a Leap Year"; // Ternary operator

        System.out.println(year + " is " + result);
    }
}
