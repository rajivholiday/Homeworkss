package hapyfamily4;

public class Dog extends Pet {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
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

