package Exercise2;

public class NormalUser extends User{
    
    private int id;
    private PhoneBookDirectory phoneBookDirectory = new PhoneBookDirectory();

    public NormalUser() {}

    public NormalUser(int id, PhoneBookDirectory phoneBookDirectory) {
        this.id = id;
        this.phoneBookDirectory = phoneBookDirectory;
    }

    public NormalUser(String username, String password, int id, PhoneBookDirectory phoneBookDirectory) {
        super(username, password);
        this.id = id;
        this.phoneBookDirectory = phoneBookDirectory;
    }

    // print user info
    public void PrintUserInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + super.getUsername());
        System.out.println("Password: " + super.getPassword());
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
}
