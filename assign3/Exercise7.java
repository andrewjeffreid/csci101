import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {

		int userInput;
		double deposit;
		double withdraw;
		double balance = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1. View your Balance");
			System.out.println("2. Deposit Cash");
			System.out.println("3. Withdraw Cash");
			System.out.println("4. Exit");
			System.out.print("Enter your selection: ");
			userInput = input.nextInt();
			
			if (userInput == 1) {
				System.out.printf("Your current balance is %.2f\n", balance);
				continue;
			} else if (userInput == 2) {
				System.out.print("Enter the amount you want to deposit: ");
				deposit = input.nextDouble();

				if (deposit > 0) {
					balance += deposit;
				} else {
					System.out.println("Incorrect Amount!");
				}
				continue;

			} else if (userInput == 3) {
				System.out.print("Enter the amount you want to withdraw: ");
				withdraw = input.nextDouble();

				if (withdraw <= balance && withdraw > 0) {
					balance -= withdraw;
				} else if (withdraw > balance) {
					System.out.println("Sorry, you don't have sufficient balance!");
				} else {
					System.out.println("Incorrect Amount!");
				}
				continue;

			} else if (userInput == 4) {
				System.out.println("Goodbye");
				break;
			} else {
				System.out.println("Incorrect selection, please try again");
				continue;
			}
		}
		input.close();
	}
}