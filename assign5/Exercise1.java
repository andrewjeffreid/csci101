import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		// setup scanner and create new array
		Scanner input = new Scanner(System.in);
		int[] myList = new int[10];

		// fill array
		for (int i=0; i < myList.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			myList[i] = input.nextInt();
		}

		// display array in reverse order
		System.out.print("In reverse order: ");
		for (int i = myList.length - 1; i >= 0; i--)
			System.out.print(myList[i] + " ");
			System.out.println();

		input.close();
	}
}