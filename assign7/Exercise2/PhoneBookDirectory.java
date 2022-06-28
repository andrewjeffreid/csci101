package Exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookDirectory {

    // array of 6 PhoneBookEntry objects
    private ArrayList<PhoneBookEntry> directory = new ArrayList<PhoneBookEntry>();

    public PhoneBookDirectory() {}

    public PhoneBookDirectory(ArrayList<PhoneBookEntry> directory) {
        this.directory = directory;
    }

    public ArrayList<PhoneBookEntry> getDirectory() {
        return directory;
    }

    // add entry to first empty space in array
    // returns 1 if entry successful or 0 otherwise (array is full)
    public void addEntry(PhoneBookEntry entry) {
        directory.add(entry);
    }

    // print all phonebook entries
    public void printAllEntries() {
        for (int i = 0; i < directory.size(); i++) {
            directory.get(i).printBookEntry();
        }
    }

    // search for an entry by Phone Number (linear seach)
    // returns 1 if phone # found and 0 otherwise
    public int LinearSearchByPhoneNumber(String phoneNumber) {
        
        int returnInteger = 0;

        for (int i = 0; i < directory.size(); i++) {
            if (directory.get(i).getPhoneNumber().equals(phoneNumber)) {
                returnInteger = 1;
                break;
            }
        }
        return returnInteger;
    }

    // search for entry by id (Using binary search)
    // returns a PhoneBookEntry if found and an empty PhoneBookEntry if NOT found
    public PhoneBookEntry SearchByIdBinarySearch(int id) {

        PhoneBookEntry[] directoryArray = directory.toArray(new PhoneBookEntry[directory.size()]);

        PhoneBookEntry returnEntry = new PhoneBookEntry();

        Arrays.sort(directoryArray);

        if (Arrays.binarySearch(directoryArray, id) > 0) {
            returnEntry = directoryArray[Arrays.binarySearch(directoryArray, id)];
        }
        return returnEntry;
    }

    // edit an entry
    // return 1 if object was found and edited and return 0 if the entry of the given userName and lastName do not exist
    public int Edit(String firstName, String lastName) {

        Scanner input = new Scanner(System.in);
        int returnInteger = 0;

        for (int i = 0; i < directory.size(); i++) {
            if (directory.get(i).getFirstName().equals(firstName) && directory.get(i).getLastName().equals(lastName)) {
                System.out.println("Enter a new phone number: ");
                directory.get(i).setPhoneNumber(input.nextLine());
                returnInteger = 1;
            }
        }
        input.close();
        return returnInteger;
    }

    // sort
    public void sort() {
        Collections.sort(directory);
    }
}
