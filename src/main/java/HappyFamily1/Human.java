package HappyFamily1;


public class Human {
    String name;
    String surname;
    int birthYear;
    int iq;
    Human mother;
    Human father;
    Pet pet = new Pet();

    String[][] schedule;


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

    public Human() {

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

    public String toString() {
        return String.format("Human" +
                "{name = %s, surname = %s, year = %d, iq = %d, mother = %s, father = %s," +
                " pet = %s }", name, surname, birthYear, iq, mother, father, pet.toString());
    }
}
