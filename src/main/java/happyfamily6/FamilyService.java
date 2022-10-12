package happyfamily6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FamilyService {
    FamilyDao myFamilyDao;
    CollectionFamilyDao myCollection = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return myCollection.getAll();
    }


    public void displayAllFamilies() {
        System.out.println(myCollection.getAll());
    }

    public List<Family> getFamiliesBiggerThan(int a) {
        ArrayList<Family> arr = new ArrayList<>();
        for (Family el : myCollection.getAll()) {
            if (el.countFamily() > a) {
                arr.add(el);
            }
        }
        return arr;
    }

    public List<Family> getFamiliesLessThan(int a) {
        ArrayList<Family> arr = new ArrayList<>();
        for (Family el : myCollection.getAll()) {
            if (el.countFamily() < a) {
                arr.add(el);
            }
        }
        return arr;
    }

    public void createNewFamily(Human mother, Human father) {
        Family newFamily = new Family(mother, father, null);
        myCollection.save(newFamily);
    }

    public void deleteFamilyByIndex(int index) {
        myCollection.delete(index);
    }


    public Family adoptChild(Family family, Human adoptedChild) {
        for (Family el : myCollection.getAll()) {
            el.addChild(adoptedChild);
        }
        return family;
    }


    public int count() {
        return myCollection.getAll().size();
    }

    public Family getFamilyById(int index) {
        return myCollection.getAll().get(index);
    }

    public Set<Pet> getPets(int index) {
        return myCollection.getAll().get(index).getPet();

    }

    public void addPet(int index, Set<Pet> pet) {
        myCollection.getFamilyByIndex(index).setPet(pet);
    }


}
