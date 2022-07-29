package HappyFamily2;


public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private Human mother;
    private Human father;
    private Pet pet = new Pet();
    private String[][] schedule;

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

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
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

    public Human() {

    }


    public void greetPet() {

        System.out.printf("Hello, %s", pet.getNickname());

    }


    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.printf("I have a %s, he is %d years old, he is very sly", pet.getSpecies(), pet.getAge());
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly", pet.getSpecies(), pet.getAge());
        }

    }

    public String toString() {
        return String.format("Human" +
                "{name = %s, surname = %s, year = %d, iq = %d, mother = %s, father = %s," +
                " pet = %s }", name, surname, birthYear, iq, mother, father, pet.toString());
    }
}
