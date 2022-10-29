package happyfamily.happyfamily7;

import java.time.LocalDate;
import java.util.Map;

final class Woman extends Human {

    public Woman() {
    }

    public Woman(String name, String surname, String birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    public Woman(String name, String surname, String birthDate, int iq, Map<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }
}
