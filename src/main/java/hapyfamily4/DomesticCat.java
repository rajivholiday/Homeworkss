package hapyfamily4;

public class DomesticCat extends Pet {
    Species familyPets = Species.CAT;
    String name;

    DomesticCat(Species familyPets, String name) {
        this.familyPets = familyPets;
        this.name = name;

    }

    @Override
    public void respond() {
        System.out.println("The Cat says: meow meow");
    }
}
