package Exercise2;

public class PhoneBookEntry implements Comparable<PhoneBookEntry> {
    
    public int compareTo(PhoneBookEntry entry) {
        return lastName.compareTo(entry.lastName);
    }

    // datafields
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;
    private String phoneNumber;

    // setters and getters
    public void setId(int newId) {
        id = newId;
    }
    public int getid() {
        return id;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }
    public String getEmail() {
        return email;
    }

    public void setZipCode(String newZipCode) {
        zipCode = newZipCode;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // constructors
    public PhoneBookEntry() {
    }

    public PhoneBookEntry(int newId, String newFirstName, String newLastName, String newEmail ,String newZipCode, String newPhoneNumber) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        zipCode = newZipCode;
        phoneNumber = newPhoneNumber;
    }

    public PhoneBookEntry(String newFirstName, String newPhoneNumber) {
        firstName = newFirstName;
        phoneNumber = newPhoneNumber;
    }

    public PhoneBookEntry(String newFirstName) {
        firstName = newFirstName;
    }

    public void printBookEntry() {
        System.out.println("ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Phone Number: " + phoneNumber);
    }
}