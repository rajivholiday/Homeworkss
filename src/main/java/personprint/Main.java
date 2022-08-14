package personprint;

import Lesson8.PersonPrinting;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"Singing", "Exercising", "Movie", "Hockey"};
        var person = new PersonPrinting("Mario", "Gomes", 35, 1987, habits);
        System.out.println(person.toString());
    }
}
