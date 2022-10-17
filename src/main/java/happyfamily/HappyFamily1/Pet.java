package happyfamily.HappyFamily1;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {
    }
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return age == pet.age && species.equals(pet.species) && nickname.equals(pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age);
    }

    @Override
    public String toString() {

        return String.format("%s{ nickname = %s, age = %d, tricklevel = %d, habits = %s }", this.species, this.nickname, this.age, this.trickLevel, Arrays.toString(habits));
    }
    public void eat() {

        System.out.println("I am eating");
    }

    public void respond() {

        System.out.printf("Hello owner. I am - %s. I miss you \n", this.nickname);
    }

    public void foul() {

        System.out.println("I need to cover it up");
    }
}
