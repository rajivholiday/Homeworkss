package happyfamily6;

import java.util.List;

public class FamilyService {
    FamilyDao myFamilyDao;
    CollectionFamilyDao myCollection  = new CollectionFamilyDao();

    public List<Family> getAllFamilies(){
        return myCollection.getAll();
    }

    public int count(){
        return myCollection.getAll().size();
    }





}
