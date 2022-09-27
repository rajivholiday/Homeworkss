package employers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WorkerDao implements DAO<Worker> {
    private final ArrayList<Worker> workers = new ArrayList<>();

    @Override
    public Worker get(Worker requestedWorker) {
        for (Worker worker : workers) {
            if (worker.equals(requestedWorker)) {
                return worker;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Worker> getAll() {
        return workers;
    }

    @Override
    public void delete(Worker worker) {
        workers.remove(worker);

    }

    @Override
    public void add(Worker worker) {
        workers.add(worker);

    }

    public void age(int age) {
        if (age < 18) {
            throw new IndexOutOfBoundsException("Access denied, you must be older than 18");
        } else {
            System.out.println("Access granted");
        }
    }

    public String convertLocalDateToString(LocalDate birthDate) {
        String s = birthDate.format(DateTimeFormatter.ISO_DATE);
        return s;
    }

    public LocalDate convertStringToLocalDate(String s) {
        LocalDate date = LocalDate.parse(s);
        return date;
    }
}
