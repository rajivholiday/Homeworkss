package employers;
import java.time.LocalDate;
import java.util.Objects;

public class Employer {
    private String firstName;
    private String lastName;
    private String companyName;
    private LocalDate birthDate;

    public Employer(String firstName, String lastName, LocalDate birthDate, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return firstName.equals(employer.firstName) && lastName.equals(employer.lastName) && companyName.equals(employer.companyName) && birthDate.equals(employer.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, companyName, birthDate);
    }
    @Override
    public String toString() {
        return "Employer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

