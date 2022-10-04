package HappyFamily1;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    String name;
    String surname;
    int birthYear;
    int iq;
    Human mother;
    Human father;
    Pet pet = new Pet();

    String[][] schedule;

    public Human() {
    }
    public Human(String name, String surname, int birthYear) {

        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Human(String name, String surname, int birthYear, Human father, Human mother) {

        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int birthYear, int iq, Human father, Human mother, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.schedule = schedule;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return birthYear == human.birthYear && iq == human.iq && name.equals(human.name) && surname.equals(human.surname) && mother.equals(human.mother) && father.equals(human.father) && pet.equals(human.pet) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, birthYear, iq, mother, father, pet);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    public String toString() {
        return String.format("Human" +
                "{name = %s, surname = %s, year = %d, iq = %d, mother = %s, father = %s," +
                " pet = %s }", name, surname, birthYear, iq, mother, father, pet.toString());
    }

    public void greetPet() {
        System.out.printf("Hello, %s", pet.nickname);
    }
    public void describePet() {
        if (pet.trickLevel > 50) {
            System.out.printf("I have a %s, he is %d years old, he is very sly", pet.species, pet.age);
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly", pet.species, pet.age);
        }
    }
}
