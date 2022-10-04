package hapyfamily4;

public class Robocat extends Pet {
    public Robocat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setFamilyPets(Species.ROBOCAT);
    }
    @Override
    public void respond() {
        System.out.println("");
    }
}
