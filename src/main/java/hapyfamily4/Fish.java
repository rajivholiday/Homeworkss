package hapyfamily4;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
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
