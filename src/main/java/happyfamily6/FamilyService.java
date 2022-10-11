package happyfamily6;
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
        if (myCollection.getAll().size() > a) {
            return myCollection.getAll();
        }
        return null;
    }

    public List<Family> getFamiliesLessThan(int a) {
        if (myCollection.getAll().size() < a) {
            return myCollection.getAll();
        }
        return null;
    }

    public Family createNewFamily(Human mother, Human father) {
        Family smith = createNewFamily(mother, father);
        myCollection.add(smith);
        return smith;
    }

    public void deleteFamilyByIndex(int index) {
        myCollection.getAll().remove(index);
    }

    public Family bornChild(Family smith, String masculine, String feminine) {
        Human david = new Man("David", "Smith", 200);
        Human kate = new Woman("Kate", "Smith", 2002);
        smith.addChild(david);
        smith.addChild(kate);
        return smith;
    }

    public Family adoptChild(Family smith, Human adoptedChild) {
        smith.addChild(adoptedChild);
        return smith;
    }

    //    public List deleteAllChildrenOlderThen(int age){
//
//    }
    public int count() {
        return myCollection.getAll().size();
    }

    public Family getFamilyById(int index) {
        return myCollection.getAll().get(index);
    }

    public Set<Pet> getPets(int index) {
        return myCollection.getAll().get(index).getPet();
    }
//    public void addPet(int index,Pet pet){
//        Family smith = myCollection.getAll().get(index);
//    }


}
