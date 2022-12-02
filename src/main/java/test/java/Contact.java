package test.java;

public class Contact {

    private String FirstName;
    private String LastName;
    private long phoneNumber;

    public Contact(String firstName, String lastName, long phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}