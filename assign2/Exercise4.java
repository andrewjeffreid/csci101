import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		char desired_grade;
		double minimum_average_required;
		double current_average;
		double final_percentage;
		double final_percentage_decimal;
		double score_needed;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter desired grade> ");
		desired_grade = input.next().charAt(0);

		System.out.print("Enter minimum average required> ");
		minimum_average_required = input.nextDouble();

		System.out.print("Enter current average in course> ");
		current_average = input.nextDouble();

		System.out.print("Enter how much the final counts as a percentage of the course grade> ");
		final_percentage = input.nextDouble();

		final_percentage_decimal = final_percentage / 100;
		score_needed = (minimum_average_required - (current_average * (1 - final_percentage_decimal)))/ final_percentage_decimal;

		System.out.printf("You need a score of %.1f on the final to get %c\n", score_needed, desired_grade);

		input.close();
	}
}