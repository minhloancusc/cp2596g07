package mypack;

/**
 *
 * @author minhloan
 */
public class Employees {
    private int employeeID;
    private String lastName;
    private String firstName;    
    private String username;
    private String password;
    private String email;
    private String photoPath;

    public Employees() {
        this.employeeID = 0;
        this.lastName = null;
        this.firstName = null;
        this.username = null;
        this.password = null;
        this.email = null;
        this.photoPath = null;
    }
        
    public Employees(int employeeID, String lastName, String firstName, String username, String password, String email, String photoPath) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.photoPath = photoPath;
    }
    
    

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    
            
}
