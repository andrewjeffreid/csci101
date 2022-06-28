package Exercise2;

import java.util.Calendar;

public class InvalidAgeException extends Exception {
    private Calendar birthday;

    // construct excpetion
    public InvalidAgeException(Calendar birthday) {

        super("Error: User can not vote this election because user's DOB is " +
        (birthday.get(Calendar.MONTH)) + "/" + (birthday.get(Calendar.DATE)) + "/" +
        (birthday.get(Calendar.YEAR)) + " and he/she will be " + getAge(birthday) + " by election day.");
        this.birthday = birthday;
    }
    // return the radius
    public Calendar getBirthday() {
        return birthday;
    }

    public static int getAge(Calendar birthday) {
        int age;
        age = 2022 - (birthday.get(Calendar.YEAR));
        System.out.print(birthday.get(Calendar.YEAR));
        if (10 - (birthday.get(Calendar.MONTH)) <= 0) {
            if (birthday.get(Calendar.DATE) > 0) {
                age -= 1;
            }
        }
        return age;
    }
}

