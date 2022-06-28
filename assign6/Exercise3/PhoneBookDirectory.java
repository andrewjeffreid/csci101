import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookDirectory {

    // array of 6 PhoneBookEntry objects
    private PhoneBookEntry[] directory = new PhoneBookEntry[6];

    // add entry to first empty space in array
    // returns 1 if entry successful or 0 otherwise (array is full)
    public int addEntry(PhoneBookEntry entry) {

        int returnInteger = 0;

        for (int i = 0; i < directory.length; i++) {
            if (directory[i] == null) {
            directory[i] = entry;
            returnInteger = 1;
            break;
            }
        }
        return returnInteger;
    }

    // print all phonebook entries
    public void printAllEntries() {
        for (int i = 0; i < directory.length; i++) {
            directory[i].printBookEntry();
        }
    }

    // search for an entry by Phone Number (linear seach)
    // returns 1 if phone # found and 0 otherwise
    public int LinearSearchByPhoneNumber(String phoneNumber) {
        
        int returnInteger = 0;

        for (int i = 0; i < directory.length; i++) {
            if (directory[i].getPhoneNumber().equals(phoneNumber)) {
                returnInteger = 1;
                break;
            }
        }
        return returnInteger;
    }

    // edit an entry
    // return 1 if object was found and edited and return 0 if the entry of the given userName and lastName do not exist
    public int Edit(String firstName, String lastName) {

        Scanner input = new Scanner(System.in);
        int returnInteger = 0;

        for (int i = 0; i < directory.length; i++) {
            if (directory[i].getFirstName().equals(firstName) && directory[i].getLastName().equals(lastName)) {
                System.out.println("Enter a new phone number: ");
                directory[i].setPhoneNumber(input.nextLine());
                returnInteger = 1;
            }
        }

        return returnInteger;
    }
}
