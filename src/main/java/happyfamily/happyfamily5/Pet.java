package happyfamily.happyfamily5;

import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public Pet() {
    }

    public Pet(Species species, String nickname) {

        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public Species getFamilyPets() {
        return species;
    }

    public void setFamilyPets(Species familyPets) {
        this.species = familyPets;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return species == pet.species && nickname.equals(pet.nickname) && habits.equals(pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, habits);
    }

    @Override
    public String toString() {

        return String.format("%s{ nickname = %s, age = %d, tricklevel = %d, habits = %s }",
                this.species, this.nickname, this.age, this.trickLevel, habits.toString());

    }

    public void eat() {

        System.out.println("I am eating");
    }

    public abstract void respond();


    public void foul() {

        System.out.println("I need to cover it up");
    }


}
