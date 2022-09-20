package employers;

public class Main {
    public static void main(String[] args) {
        WorkerDao dao = new WorkerDao();
        Worker worker1 = new Worker("Brad", "Wilson", 3000.0);
        dao.add(worker1);


    }
}
