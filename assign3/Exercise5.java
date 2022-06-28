import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {

		String month;
		String season = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month name: ");
		month = input.next().toLowerCase();

		switch (month) {
		case "january":
			season = "Winter";
			break;
		case "february":
			season = "Winter";
			break;
		case "march":
			season = "Spring";
			break;
		case "april":
			season = "Spring";
			break;
		case "may":
			season = "Spring";
			break;
		case "june":
			season = "Summer";
			break;
		case "july":
			season = "Summer";
			break;
		case "august":
			season = "Summer";
			break;
		case "september":
			season = "Fall";
			break;
		case "october":
			season = "Fall";
			break;
		case "november":
			season = "Fall";
			break;
		case "december":
			season = "Winter";
			break;
		}
		System.out.println("Season is: " + season);
		input.close();
	}
}