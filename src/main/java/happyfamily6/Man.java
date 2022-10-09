package happyfamily6;

import java.util.Map;

final class Man extends Human {

    public Man() {
    }

    public Man(String name, String surname, int birthYear, int iq, Map<String, String> schedule) {
        super(name, surname, birthYear, iq, schedule);
    }

    public Man(String name, String surname, int birthYear) {
        super(name, surname, birthYear);
    }

    public void repairCar() {
        System.out.println("The car needs to be repaired soon");
    }
}
