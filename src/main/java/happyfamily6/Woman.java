package happyfamily6;

import java.util.Map;

final class Woman extends Human {

    public Woman() {
    }

    public Woman(String name, String surname, int birthYear, int iq, Map<String, String> schedule) {
        super(name, surname, birthYear, iq, schedule);
    }

    public Woman(String name, String surname, int birthYear) {
        super(name, surname, birthYear);
    }

    public void makeUp() {
        System.out.println("Makeup for the wedding");

    }
}
