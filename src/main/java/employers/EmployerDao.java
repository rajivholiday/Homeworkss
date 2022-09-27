package employers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EmployerDao implements DAO<Employer> {
    private final ArrayList<Employer> employers = new ArrayList<>();

    @Override
    public ArrayList<Employer> getAll() {
        return employers;
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);

    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);

    }


    @Override
    public Employer get(Employer requestedEmployer) {
        for (Employer hr : employers) {
            if (hr.equals(requestedEmployer)) {
                return hr;
            }
        }
        return null;

    }

    public void age(int age) {
        if (age < 18) {
            throw new IndexOutOfBoundsException("Access denied, you must be older than 18");
        } else {
            System.out.println("Access granted");
        }
    }

    public String convertBirthDateToString(LocalDate birthDate) {
        String s = birthDate.format(DateTimeFormatter.ISO_DATE);
        return s;

    }

    public LocalDate convertStringToDate(String s) {
        LocalDate date = LocalDate.parse(s);
        return date;

    }
}
