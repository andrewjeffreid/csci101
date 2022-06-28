package Exercise2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VotingValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month (1-12): ");
        int month = input.nextInt() - 1;
        System.out.print("Day: ");
        int day = input.nextInt();

        try {
            ValidateAge(year, month, day);
        }
        catch (InvalidAgeException ex) {
            System.out.println(ex);
        }
        input.close();
    }

    public static void ValidateAge(int year, int month, int day) throws InvalidAgeException {
        Calendar cutoff = new GregorianCalendar(2001, 10, 3);
        Calendar birthday = new GregorianCalendar(year, month, day);

        if (cutoff.compareTo(birthday) >= 0) {
            System.out.println("Welcome to Vote!");
        } else if (cutoff.compareTo(birthday) < 0) {
            throw new InvalidAgeException(birthday);
        }
    }
}
