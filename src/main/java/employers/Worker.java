package employers;

import java.time.LocalDate;
import java.util.Objects;

public class Worker {
    private String firstName;
    private String lastName;
    private double salary;
    private LocalDate birthDate;

    public Worker(String firstName, String lastName, LocalDate birthDate, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        return Double.compare(worker.salary, salary) == 0 && firstName.equals(worker.firstName) && lastName.equals(worker.lastName) && birthDate.equals(worker.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, birthDate);
    }
}
