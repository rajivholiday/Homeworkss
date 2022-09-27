package hapyfamily4;

public class Dog extends Pet {
    Species familyPets = Species.DOG;


    @Override
    public void respond() {
        System.out.println("The dog says: bow bow");
    }

    @Override
    public void foul() {
        super.foul();
    }
}

