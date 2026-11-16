import java.util.Scanner;

public class passWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password;
        String correctPassword = "1234"; // Correct password

        do {
            System.out.print("Enter Password: ");
            password = input.nextLine(); // Take password input

            if (!password.equals(correctPassword)) {
                System.out.println("Wrong Password! Try Again.");
            }

        } while (!password.equals(correctPassword)); // Repeat until correct

        System.out.println("Access Granted!");

        input.close();
    }
}
