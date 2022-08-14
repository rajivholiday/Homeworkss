package personprint;

import java.util.Arrays;

public class PersonPrinting {
    String name;
    String surname;
    int age;
    int birthYear;
    String[] habits;

    public PersonPrinting(String name, String surname, int age, int birthYear, String[] habits) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthYear = birthYear;
        this.habits = habits;
    }

    public String toString() {
        return String.format("Name is: %s  \n" + "Surname is: %s \n" + "age: %d \n" + "birthyear is: %d \n" + "habits are:%s ",
                name, surname, age, birthYear, Arrays.toString(habits));
    }

}
