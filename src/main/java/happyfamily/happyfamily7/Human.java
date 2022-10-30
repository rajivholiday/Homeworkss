package happyfamily.happyfamily7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<String, String> schedule;
    private Family family;

    public Human() {

    }

    public Human(String name, String surname, String birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        try {
            SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
            Date date = obj.parse(birthDate);
            this.birthDate = date.getTime();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public Human(String name, String surname, String birthDate, int iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.schedule = schedule;
        try {
            SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
            Date date = obj.parse(birthDate);
            this.birthDate = date.getTime();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getBirthDate() {
        return describeAge(this.birthDate);

    }

    public void setBirthYear(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return birthDate == human.birthDate && name.equals(human.name) && surname.equals(human.surname) && family.equals(human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, family);
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        Date date = new Date(birthDate);
        DateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
        String s = obj.format(date);
        return String.format("Human" +
                        "{name = %s, surname = %s, year = %s, iq = %d, schedule = %s}", name, surname, birthDate, iq,
                schedule);
    }

    public int describeAge(long milliseconds) {
        long epoch = Instant.now().toEpochMilli();
        long diff = epoch - birthDate;
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        int year = (int) (days / 365);
        days = days % 365;
        long months = days / 30;
        days = days % 30;

        return year;


    }
}
