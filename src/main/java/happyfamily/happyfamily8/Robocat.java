package happyfamily.happyfamily8;

import java.util.Set;

public class Robocat extends Pet {
    public Robocat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }
    @Override
    public void respond() {
        System.out.println("");
    }

}
