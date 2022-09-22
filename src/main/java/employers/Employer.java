package employers;

import java.util.Objects;

public class Employer {
    private String firstName;
    private String lastName;
    private String companyName;

    public Employer(String firstName, String lastName, String companyName) {
        firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
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
                "FirstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return firstName.equals(employer.firstName) && lastName.equals(employer.lastName) && companyName.equals(employer.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, companyName);
    }
}
