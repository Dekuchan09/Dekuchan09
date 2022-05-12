
public class Author{
    // Instance variables
    private String firstName;
    private String lastName;
    // Constructor
    public Author(String firstName, String lastName){
        firstName = firstName;
        lastName = lastName;
    }
    // Instance methods
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    public String toString(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
