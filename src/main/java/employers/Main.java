package employers;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        WorkerDao workerDao = new WorkerDao();
        LocalDate date1 = LocalDate.of(1990, 4, 9);
        LocalDate date2 = LocalDate.of(1992, 3, 11);


        Worker worker1 = new Worker("Brad", "Wilson", date2, 3000.0);
        workerDao.add(worker1);
        System.out.println(workerDao.getAll());

        EmployerDao empDao = new EmployerDao();
        Employer emp = new Employer("Romano", "Prodi", date1, "Mercedes");
        empDao.add(emp);
        System.out.println(empDao.getAll());
        workerDao.age(18);

        System.out.println(empDao.convertBirthDateToString(date1));
        System.out.println(empDao.convertStringToDate("2019-03-09"));

        System.out.println(workerDao.convertStringToLocalDate("2022-09-27"));
        System.out.println(workerDao.convertLocalDateToString(date1));
        empDao.age(13);


    }
}
