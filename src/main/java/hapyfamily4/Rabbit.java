package hapyfamily4;

public class Rabbit extends Pet{
    public Rabbit(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setFamilyPets(Species.UNKNOWN);
    }

    @Override
    public void respond() {

    }
}
