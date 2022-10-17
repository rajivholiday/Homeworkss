package happyfamily.happyfamily6;

import java.util.Set;

public class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setFamilyPets(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.println("The Fish says: muah muah");
    }

    @Override
    public void foul() {
        super.foul();
        System.out.println();
    }
}
