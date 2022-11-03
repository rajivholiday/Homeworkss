package new_projects.les3_12.service;

import new_projects.les3_12.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {

    public List<Dog> dogGetAll() {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Max", 10);
        Dog dog2 = new Dog("Rex", 20);
        Dog dog3 = new Dog("Bars", 30);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        return dogs;
    }

    public Dog dogById(int id) {
        for (Dog d : dogGetAll())
            if (d.getId() == id) {
                return d;
            }
        return null;
    }
}
