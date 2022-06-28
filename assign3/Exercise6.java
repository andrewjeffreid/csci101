import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		String password;
		boolean allNum = true;
		boolean allAlpha = true;
		boolean hasDigit = false;
		boolean hasAlpha = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a password: ");
		password = input.next();

		if (password.length() < 8) {
			System.out.println("Weak Password");
		} else if (8 <= password.length() && password.length() <= 12) {
			char c;
			int countDigit = 0;
			for (int i = 0; i < password.length(); i++) {
				c = password.charAt(i);
				if (!Character.isLetter(c)) {
					allAlpha = false;
				} else if (!Character.isDigit(c)) {
					allNum = false;
				} else if (Character.isDigit(c)) {
					countDigit += 1;
					if (countDigit > 1) {
						hasDigit = true;
					}
				} else if (Character.isLetter(c)) {
					hasAlpha = true;
					if (Character.isUpperCase(c)) {
						hasUpper = true;
					} else if (Character.isLowerCase(c)) {
						hasLower = true;
					}
				}
			}

			if (allAlpha || allNum) {
				System.out.println("Medium Password");
			} else if (hasUpper ^ hasLower && hasDigit) {
				System.out.println("OK Password");
			} else if (hasUpper && hasLower && hasDigit) {
				System.out.println("Strong Password");
			}

		} else if (password.length() > 12) {
			System.out.println("Awesome password");
		} else {
			System.out.println("Invalid Password");
		}

		input.close();
	}

}