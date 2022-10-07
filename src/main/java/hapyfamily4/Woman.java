package hapyfamily4;

final class Woman extends Human {
    public Woman(String name, String surname, int birthYear, int iq, String[][] schedule) {
        super(name, surname, birthYear, iq, schedule);
    }

    public Woman(String name, String surname, int birthYear) {
        super(name, surname, birthYear);
    }

    public void makeUp() {
        System.out.println("Makeup for the wedding");

    }
}
