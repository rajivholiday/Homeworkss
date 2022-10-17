package happyfamily.happyfamily6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FamilyService {
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

    public int countFamiliesWithMemberNumber(int number) {
        int count = 0;
        for (Family el : myCollection.getAll()) {
            if (el.countFamily() == number) {
                count++;
            }
        }
        return count;
    }

    public void createNewFamily(Human mother, Human father) {
        List<Human> children = new ArrayList<>();
        Family newFamily = new Family(mother, father, children);
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

    public void deleteAllChildrenOlderThan(int givenAge) {
        for (Family el : myCollection.getAll()) {
            List<Human> children = el.getChildren();
            for (Human kid : children) {
                if (kid.getBirthYear() > givenAge) {
                    children.remove(kid);
                }
            }
        }
    }

    public int count() {
        return myCollection.getAll().size();
    }

    public Family getFamilyById(int index) {
        return myCollection.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return myCollection.getFamilyByIndex(index).getPet();
    }

    public void addPet(int index, Pet pet) {
        myCollection.getFamilyByIndex(index).getPet().add(pet);
    }
}
