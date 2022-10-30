package happyfamily.happyfamily8;

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
        myCollection.getAll().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int a) {
        return myCollection.getAll().stream().filter(el -> el.countFamily() > a).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Family> getFamiliesLessThan(int a) {
        return myCollection.getAll().stream().filter(el -> el.countFamily() < a).
                collect(Collectors.toCollection(ArrayList::new));
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

    public void deleteAllChildrenOlderThan(int givenAge) {
        myCollection.getAll().stream().map(Family::getChildren).forEach(children -> {
            List<Human> children2 = new ArrayList<>(children);
            children.removeIf(kid -> kid.getBirthDate() > givenAge);
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
