import java.util.Scanner;
class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}
public class Auth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "1234";

        System.out.println("Login System");

        try {
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();

            System.out.print("Enter password: ");
            String inputPass = sc.nextLine();

            if (!user.equals(inputUser) || !pass.equals(inputPass)) {
                throw new InvalidLoginException("Invalid username or password");
            }

            System.out.println("Login successful");

        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}