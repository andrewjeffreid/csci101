import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] myArray = new int[100];
		int[] duplicates = new int[100];

		System.out.print("Enter the integers between 1 and 100: ");

		int userInput = 1;
		int k = 0;
		while (userInput != 0) {
			userInput = input.nextInt();
			myArray[k] = userInput;
			k++;
		}

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] != 0 && !checkDuplicate(myArray[i], duplicates)) {
				System.out.print(count(myArray[i], myArray) + ", ");
				duplicates[i] = myArray[i];
			}
			
		}
		System.out.println();

	input.close();
	}

	public static String count(int element, int[] myArray) {
		int count = 0;
		String countString = "";
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == element) {
				count += 1;
			}
		}

		if (count == 1) {
			countString = String.valueOf(element) + 
			" occurs " + String.valueOf(count) + " time";
		} else {
			countString = String.valueOf(element) + 
			" occurs " + String.valueOf(count) + " times";
		}
		return countString;
	}

	public static boolean checkDuplicate(int element, int[] duplicates) {
		boolean status = false;
		for (int i = 0; i < duplicates.length; i++) {
			if (element == duplicates[i]) {
				status = true;
				break;
			}
		}
		return status;
	}
}