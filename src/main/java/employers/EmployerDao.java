package employers;

import java.util.ArrayList;

public class EmployerDao implements Company<Employer> {
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
    public Employer get(Employer managerName) {
        for (Employer manager : employers) {
            if (manager.getCompanyName() == managerName.getCompanyName()) {
                manager = managerName;


            }

        }
    }
}
