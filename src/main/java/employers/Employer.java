package employers;

public class Employer {
    private String FirstName;
    private String lastName;
    private String companyName;

    public Employer(String firstName, String lastName, String companyName) {
        FirstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
