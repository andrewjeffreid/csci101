import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
	
		char chr;
		char randomChar;
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter letter “a” to generate a random char (a-z), or enter letter “A” to generate a random char between (A-Z).");
			chr = input.next().charAt(0);

			if (chr == 'a') {

				randomChar = (char)(97 + (int)(Math.random() * 26));
				System.out.printf("Your random char is %c.\n",randomChar);
				break;

			} else if (chr == 'A') {

				randomChar = (char)(65 + (int)(Math.random() * 26));
				System.out.printf("Your random char is %c.\n",randomChar);
				break;

			} else {

				System.out.println("Invalid entry, please try again");
				continue;
			}

		}
		input.close();
	}
}