import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		String string1;
		String string2;
		String iterator = "";
		String prefix = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		string1 = input.nextLine();
		System.out.print("Enter the second string: ");
		string2 = input.nextLine();

		if (string1.length() > string2.length()) {
			iterator = string2;
		} else {
			iterator = string1;
		}

		for (int i = 0; i < iterator.length(); i++){
			char c1 = Character.toLowerCase(string1.charAt(i));
			char c2 = Character.toLowerCase(string2.charAt(i));
			if (c1 == c2) {
				prefix += c1;
			} else {
				break;
			}
		}
		if (prefix.equals("")) {
			System.out.println(string1 + " and " + string2 + " have no common prefix.");
		} else {
			System.out.println("The common prefix is: " + prefix);
		}

		input.close();
	}
}