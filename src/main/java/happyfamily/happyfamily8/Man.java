package happyfamily.happyfamily8;

import java.util.Map;

final class Man extends Human {

    public Man() {
    }

    public Man(String name, String surname, String birthDate, int iq, Map<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Man(String name, String surname, String birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }
}

