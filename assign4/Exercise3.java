import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {

		String userInput;
		String word = "";
		String palindrome = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word: ");
		userInput = input.nextLine();

		for (int i = 0; i < userInput.length(); i++) {
			if (Character.isLetter(userInput.charAt(i))) {
				word += userInput.charAt(i);
			}
		}

		System.out.println(word);

		
		for (int i = userInput.length() - 1; i >= 0; i--) {

			if (Character.isLetter(userInput.charAt(i))) {
				palindrome += userInput.charAt(i);
			}
		}
		System.out.println(palindrome);

		if (word.equalsIgnoreCase(palindrome)) {
			System.out.println(userInput + " is a palindrome!");
		} else {
			System.out.println(userInput + " is not a palindrome.");
		}

		input.close();
	}
}