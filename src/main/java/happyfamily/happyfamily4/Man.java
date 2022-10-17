package happyfamily.happyfamily4;

final class Man extends Human {

    public Man() {
    }

    public Man(String name, String surname, int birthYear, int iq, String[][] schedule) {
        super(name, surname, birthYear, iq, schedule);
    }

    public Man(String name, String surname, int birthYear) {
        super(name, surname, birthYear);
    }

    public void repairCar() {
        System.out.println("The car needs to be repaired soon");
    }
}
