import java.util.Scanner;
import Exceptions.PasswordInvalidException;

public class Main {
    public static void main( String[] args ) {
        String[] user_and_password = { "username", "administrator" };
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your username: ");
            String username = sc.nextLine();
            System.out.print("Enter your password: ");
            String password = sc.nextLine();

            if (username.equals(user_and_password[0]) && password.equals(user_and_password[1])) {
                System.out.println("Access granted.");
                return;
            } else {
                attempts++;
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        try {
            throw new PasswordInvalidException("Password invalid for 3 times");
        } catch (PasswordInvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}