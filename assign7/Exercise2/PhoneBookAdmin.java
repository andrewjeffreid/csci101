package Exercise2;

public class PhoneBookAdmin extends User {

    private String emailAddress;
    private PhoneBookDirectory phoneBookDirectory = new PhoneBookDirectory();

    public PhoneBookAdmin() {
    }

    public PhoneBookAdmin(String emailAddress, PhoneBookDirectory phoneBookDirectory) {
        this.emailAddress = emailAddress;
        this.phoneBookDirectory = phoneBookDirectory;
    }

    public PhoneBookAdmin(String username, String password, String emailAddress,
            PhoneBookDirectory phoneBookDirectory) {
        super(username, password);
        this.emailAddress = emailAddress;
        this.phoneBookDirectory = phoneBookDirectory;
    }


    // print admin info
    public void PrintUserInfo() {
        System.out.println("Username: " + super.getUsername());
        System.out.println("Password: " + super.getPassword());
        System.out.println("Email: " + emailAddress);
        System.out.print("Phone Book Directory: ");
        phoneBookDirectory.printAllEntries();
    }

    // add entry
    public void addEntry(PhoneBookEntry entry) {
        phoneBookDirectory.addEntry(entry);
    }

    // edit entry
    public void editEntry(String firstName, String lastName) {
        phoneBookDirectory.Edit(firstName, lastName);
    }

    // delete entry
    public void deleteEntry(String firstName, String lastName) {
        for (int i = 0; i < phoneBookDirectory.getDirectory().size(); i++) {
            if (phoneBookDirectory.getDirectory().get(i).getFirstName().equals(firstName) && phoneBookDirectory.getDirectory().get(i).getLastName().equals(lastName)) {
                phoneBookDirectory.getDirectory().remove(i);
            }
        }
    }

    // sort by last name
    public void sortDirectory() {
        phoneBookDirectory.sort();
    }

    // linear search
    public void linearSearch(String phoneNumber) {
        phoneBookDirectory.LinearSearchByPhoneNumber(phoneNumber);
    }

    // binary seach
    public void binarySearch(int id) {
        phoneBookDirectory.SearchByIdBinarySearch(id);
    }

    // change username
    public void setUsername(String newUsername) {
        super.setUsername(newUsername);
    }

    // change password
    public void setPassword(String newPassword) {
        super.setPassword(newPassword);
    }
}
