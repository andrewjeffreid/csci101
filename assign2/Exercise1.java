import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		double x;
		double y;
		double result;
		Scanner input = new Scanner(System.in);

		//x
		System.out.print("Enter a non-zero value for x: ");
		x = input.nextDouble();

		//y
		System.out.print("Enter a non-zero value for y: ");
		y = input.nextDouble();

		//calculate and display result
		result = ((3 + 4 * x) / 5) - ((10 * (y - 5)) / x) + 9 * ((4 / x) + ((9 + x) / y));
		System.out.printf("The result is %f\n", result);
	}
}