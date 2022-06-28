package Exercise2;

public class User {
    
    private String username;
    private String password;

    public User() {}

    public User(String username, String password) {
        this.username = setUsername(username);
        this.password = setPassword(password);
    }

    public void PrintUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public void setUsername(String newUsername) {
        username = newUsername;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
