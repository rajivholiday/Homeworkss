package hapyfamily4;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
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
