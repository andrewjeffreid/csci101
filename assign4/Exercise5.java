import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		System.out.print("Enter 0 for a random integer or 1 for a random character: ");
		option = input.nextByte();

		if (option == 0) {
			int userInput1;
			int userInput2;

			System.out.println("Enter lower bound integer: ");
			userInput1 = input.nextInt();
			System.out.println("Enter upper bound integer: ");
			userInput2 = input.nextInt();
			System.out.println("Random Integer: " + rando(userInput1, userInput2));


		} else if (option == 1) {
			char userInput1;
			char userInput2;

			System.out.println("Enter lower bound character: ");
			userInput1 = input.next().charAt(0);
			System.out.println("Enter upper bound character: ");
			userInput2 = input.next().charAt(0);
			System.out.println("Random Character: " + rando(userInput1, userInput2));
	
		}
		input.close();
	}


	public static int rando(int int1, int int2) {
		int randomInt = int1 + (int)(Math.random() * ((int2 - int1) + 1));
		return randomInt;
	}

	public static char rando(char char1, char char2) {
		int charInt1 = (int) char1;
		int charInt2 = (int) char2;
		char randomChar = (char)(charInt1 + (int)(Math.random() * ((charInt2 - charInt1) + 1)));
		return randomChar;
	}
}