import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		double num1;
		double num2;
		double max;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num1 = input.nextDouble();
		System.out.print("Enter another number: ");
		num2 = input.nextDouble();

		max = Math.max(num1, num2);
		System.out.printf("The maximum of %.2f and %.2f is %.2f.\n", num1, num2, max);

		input.close();
	}
}