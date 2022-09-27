package hapyfamily4;

public class Fish extends Pet {
    Species familyPets = Species.FISH;

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
