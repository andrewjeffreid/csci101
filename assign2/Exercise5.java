import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int X;
		int Y;
		int sum;
		int difference;
		int quotient; 
		int product;
		int remainder;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an x-value: ");
		X = input.nextInt();

		System.out.print("Enter an y-value: ");
		Y = input.nextInt();

		sum = X + Y;
		difference = X - Y;
		quotient = (double) X / Y;
		product = X * Y;
		remainder = X % Y;

		System.out.println("Sum of x and y: " + sum);
		System.out.println("Subtraction of x and y: " + difference);
		System.out.println("Division of x and y: " + quotient);
		System.out.println("Multiplication of x and y: " + product);
		System.out.println("Remainder of x and y: " + remainder);

		input.close();
	}
}