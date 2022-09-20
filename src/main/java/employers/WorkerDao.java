package employers;

import java.util.ArrayList;

public class WorkerDao implements DAO<Worker> {
    private final ArrayList<Worker> workers = new ArrayList<>();

    @Override
    public Worker get(Worker workerName) {
        for (Worker workerNames : workers) {
            if (workerNames == workerName) {

            }
        }
        return workerName;
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
}
