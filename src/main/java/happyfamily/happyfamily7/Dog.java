package happyfamily.happyfamily7;

import java.util.Set;

public class Dog extends Pet {

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setFamilyPets(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("The dog says: bow bow");
    }

    @Override
    public void foul() {
        super.foul();
    }
}

