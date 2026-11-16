public class SeriesMath {
    public static void main(String[] args) {

        int n = 5; // Number of terms
        double sum = 0; // Store series sum

        for (int i = 1; i <= n; i++) {
            sum = sum + (i / Math.pow(2, i)); // Calculate each term
        }

        System.out.println("Sum of Series: " + sum);
    }
}
