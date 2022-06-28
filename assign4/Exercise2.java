import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		// setup variables and scanner
		String numString;
		String reverseNum = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		numString  = input.next();

		
		for (int i = numString.length() - 1; i >= 0; i--) {
			reverseNum += numString.charAt(i);
		}
		System.out.println(reverseNum);
		input.close();
	}
}