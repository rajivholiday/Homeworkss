package new_projects.les3_12.service;

import new_projects.les3_12.entity.Cat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatService {
    public List<Cat> catGetAll() {
        List<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Graf", 5);
        Cat cat2 = new Cat("Kiki", 15);
        Cat cat3 = new Cat("Tiger", 25);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        return cats;
    }

    public Cat catById(int id) {
        for (Cat c : catGetAll())
            if (c.getId() == id) {
                return c;
            }
        return null;
    }
}
