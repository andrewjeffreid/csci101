import java.util.*;

/*
If $1 Dollar equals to 0.9 Euros
Write a java program that ask the user to enter the amount they need to convert.
Then the program will ask the user to enter either 1 or 2
If the user enters 1, then you convert the values from dollars to euros
If the user enters 2, then you convert the values from euros to dollars.
The output of the program is a single line
You entered xx.xx in “Dollars/Euros” based on the user and they are equals to zz.zz (Euros/Dollars)
*/

public class Exercise3 {
	public static void main(String[] args) {

		// declare variables
		double amount;
		int option;
		Scanner input = new Scanner(System.in);

		// take amount
		System.out.print("Enter an amount to convert: ");
		amount = input.nextDouble();

		// take option
		System.out.print("Enter 1 (dollars->euros) or 2 (euros->dollars): ");
		option = input.nextInt();

		if (option == 1) {

			double euros = amount * 0.9;
			System.out.printf("You entered %.2f in Dollars and they are equal to %.2f Euros\n",
				amount, euros);

		} else if (option == 2) {

			double dollars = amount / 0.9;
			System.out.printf("You entered %.2f in Euros and they are equal to %.2f Dollars\n",
				amount, dollars);
			
		} else {

			System.out.println("Error: Enter a 1 or 2.");
		
		}

		input.close();

	}
}