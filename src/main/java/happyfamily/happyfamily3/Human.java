package happyfamily.happyfamily3;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human() {
    }
    public Human(String name, String surname, int birthYear, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int birthYear) {

        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return birthYear == human.birthYear && name.equals(human.name) && surname.equals(human.surname) && family.equals(human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, family);
    }

    public String toString() {
        return String.format("Human" +
                        "{name = %s, surname = %s, year = %d, iq = %d, schedule = %s}", name, surname, birthYear, iq,
                Arrays.deepToString(schedule));
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Human objects got deleted");
    }
}
