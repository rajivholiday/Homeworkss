package happyfamily.happyfamily8;

import java.util.Set;

public class DomesticCat extends Pet {
    public DomesticCat( String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setFamilyPets(Species.CAT);
    }

    public DomesticCat() {
        super();
    }

    @Override
    public void respond() {
        System.out.println("The Cat says: meow meow");
    }
}
