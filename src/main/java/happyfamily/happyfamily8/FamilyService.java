package happyfamily.happyfamily8;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    CollectionFamilyDao myCollection = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return myCollection.getAll();
    }

    public void displayAllFamilies() {
        System.out.println(myCollection.getAll());
    }

    public List<Family> getFamiliesBiggerThan(int a) {
        return myCollection.getAll().stream().filter(el -> el.countFamily() > a).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Family> getFamiliesLessThan(int a) {
        ArrayList<Family> arr = myCollection.getAll().stream().filter(el -> el.countFamily() < a).
                collect(Collectors.toCollection(ArrayList::new));
        return arr;
    }

    public int countFamiliesWithMemberNumber(int number) {
        return (int) myCollection.getAll().stream().filter(el -> el.countFamily() == number).count();
    }

    public Family createNewFamily(Human mother, Human father) {
        List<Human> children = new ArrayList<>();
        Set<Pet> pets = new HashSet<>();
        Family newFamily = new Family(mother, father, children, pets);
        myCollection.save(newFamily);
        return newFamily;
    }

    public void deleteFamilyByIndex(int index) {
        myCollection.delete(index);
    }


    public Family adoptChild(Family family, Human adoptedChild) {
        family.addChild(adoptedChild);
        return family;
    }

    public void deleteAllChildrenAllThan(int givenAge) {
        myCollection.getAll().stream().map(Family::getChildren).forEach(children -> {
            List<Human> children2 = new ArrayList<>(children);
            long epoch = Instant.now().toEpochMilli();
            children2.stream().filter(kid -> kid.describeAge(epoch) > givenAge).forEach(children::remove);
        });
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
