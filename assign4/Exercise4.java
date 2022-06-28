import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		number = input("enternumber")
		binarynumber = ""
		while int(number) != 0:
    		remainder = int(number) % 2
   			binarynumber += str(remainder)
    		number = int(number) // 2
		print(binarynumber[::-1])*/

		int decimalNum;
		String binaryNum = "";
		String formatBinaryNum = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		decimalNum = input.nextInt();

		int remainder;
		while (decimalNum != 0) {
			remainder = decimalNum % 2;
			binaryNum += String.valueOf(remainder);
			decimalNum = decimalNum / 2;
		}

		for (int i = binaryNum.length() - 1; i >= 0; i--) {
			 formatBinaryNum += binaryNum.charAt(i);
		}

		System.out.println("In binary: " + formatBinaryNum);

		input.close();
	}
}