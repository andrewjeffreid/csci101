public class PhoneBook {
    public static void main(String[] args) {

        // (A)
        PhoneBookEntry firstObject = new PhoneBookEntry(5, "John", "Smith", "jsmith@gmail.edu", "20037", "2023334444");
        PhoneBookEntry secondObject = new PhoneBookEntry("James", "202344344");
        PhoneBookEntry thirdObject = new PhoneBookEntry("Sarah");

        // (B)
        /*
        I changed John's phone number using the setter method I created in the
        PhoneBookEntry class. From this method, I cannot directly access the 
        datafield because it is private, which is why I use the setter method.
        */
        firstObject.setPhoneNumber("2025555555");

        /*
        Here I simply invoke the printBookEntry method in the PhoneBookEntry
        class.
        */
        firstObject.printBookEntry();

        /*
        Here, I use a getter and setter method to set Jame's zipcode (setZipCode)
        to John's zipcode (getZipCode). This is because I cannot access the private
        datafields from here. I use the same class methods but on different
        objects. 
        */
        secondObject.setZipCode(firstObject.getZipCode());
    }
}
