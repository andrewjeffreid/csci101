import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {

		int numericGrade;
		String letterGrade;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter numeric percentage:");
		numericGrade = input.nextInt();

		if (93 <= numericGrade && numericGrade <= 100) {
			letterGrade = "A";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (90 <= numericGrade && numericGrade <= 92) {
			letterGrade = "A-";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (88 <= numericGrade) {
			letterGrade = "B+";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (84 <= numericGrade) {
			letterGrade = "B";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (80 <= numericGrade) {
			letterGrade = "B-";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (78 <= numericGrade) {
			letterGrade = "C+";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (74 <= numericGrade) {
			letterGrade = "C";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (70 <= numericGrade) {
			letterGrade = "C-";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (68 <= numericGrade) {
			letterGrade = "D+";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (64 <= numericGrade) {
			letterGrade = "D";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (60 <= numericGrade) {
			letterGrade = "D-";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		} else if (0 <= numericGrade) {
			letterGrade = "F";
			System.out.printf("You entered %d%%, your letter grade is %s\n", numericGrade, letterGrade);
		}
		input.close();
	}
}