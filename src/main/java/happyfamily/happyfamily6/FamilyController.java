package happyfamily.happyfamily6;

import java.util.List;
import java.util.Set;

public class FamilyController {
    private FamilyService service = new FamilyService();

    public List<Family> getAllFamilies() {
        return service.getAllFamilies();
    }

    public void displayAllFamilies() {
        service.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int a) {
        return service.getFamiliesBiggerThan(a);
    }

    public List<Family> getFamiliesLessThan(int a) {
        return service.getFamiliesLessThan(a);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return service.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human mother, Human father) {
        service.createNewFamily(mother, father);
    }

    public void deleteFamilyByIndex(int index) {
        service.deleteFamilyByIndex(index);
    }


    public Family adoptChild(Family family, Human adoptedChild) {
        return service.adoptChild(family, adoptedChild);
    }

    public void deleteAllChildrenOlderThan(int givenAge) {
        service.deleteAllChildrenOlderThan(givenAge);
    }


    public int count() {
        return service.count();
    }

    public Family getFamilyById(int index) {
        return service.getFamilyById(index);
    }

    public Set<Pet> getPets(int index) {
        return service.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        service.addPet(index, pet);
    }
}
