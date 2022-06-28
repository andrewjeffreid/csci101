import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Enter list length: ");
		int[] list = new int[input.nextInt()];

		for (int i = 0; i < list.length; i++) {
			System.out.print("Enter element " + i + " of the list: ");
			list[i] = input.nextInt();
		}

		for (int j = 0; j < list.length; j++) {
			System.out.print(list[j] + " ");
		}
		System.out.println();

		if (isSorted(list)) {
			System.out.println("The list is already sorted");
		} else {
			System.out.println("The list is not sorted");
		}
	}

	public static boolean isSorted(int[] list) {
		int previousIteration = list[0];
		boolean isSorted = true;

		for (int i = 0; i < list.length; i++) {
			if (list[i] < previousIteration) {
				isSorted = false;
				break;
			} else {
				previousIteration = list[i];

			}
		}
		return isSorted;
	}
}