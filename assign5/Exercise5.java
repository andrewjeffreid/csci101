import java.util.Arrays;

public class Exercise5 {
	public static void main(String[] args) {
		int[][] arr = new int[7][7];

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = (int)(Math.random() * 100);
			}
		}

		System.out.println("Original Array: ");
		displayArray(arr);

		System.out.println("Sorted Rows: ");
		sortArrayRows(arr);
		
		System.out.println("Sorted Array: ");
		sortArray(arr);
	}

	public static void sortArrayRows(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				int currentMin = arr[row][column];
				int currentMinIndex = column;

				for (int i = column + 1; i < arr[row].length; i++) {
					if (currentMin > arr[row][i]) {
						currentMin = arr[row][i];
						currentMinIndex = i;
					}
				}

				if (currentMinIndex != column) {
					arr[row][currentMinIndex] = arr[row][column];
					arr[row][column] = currentMin;
				}
			}
		}
		displayArray(arr);
	}

	public static void displayArray(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + " ");
			}
			System.out.println();
		}
	}
}