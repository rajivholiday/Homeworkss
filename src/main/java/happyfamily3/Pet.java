package happyfamily3;
import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private Species familyPets;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(Species familyPets, String nickname) {

        this.familyPets = familyPets;
        this.nickname = nickname;
    }

    public Pet(Species familyPets, String nickname, int age, int trickLevel, String[] habits) {
        this.familyPets = familyPets;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getFamilyPets() {
        return familyPets;
    }

    public void setFamilyPets(Species familyPets) {
        this.familyPets = familyPets;
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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return age == pet.age && trickLevel == pet.trickLevel && familyPets == pet.familyPets && nickname.equals(pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(familyPets, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s{ nickname = %s, age = %d, tricklevel = %d, habits = %s }", this.familyPets,
                this.nickname, this.age, this.trickLevel, Arrays.toString(habits));

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

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pet objects got deleted");
    }
}
