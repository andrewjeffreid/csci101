import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		// declare variables and setup scanner
		String validPassword = "NYU42day";
		String userPassword;
		Scanner input = new Scanner(System.in);

		// take user input
		System.out.print("Enter a password: ");
		userPassword = input.nextLine();

		// validate user input
		if (userPassword.equals(validPassword)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
		input.close();
	}
}