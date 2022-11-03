package new_projects.les3_12.service;

import new_projects.les3_12.entity.Parrot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParrotService {

    public List<Parrot> parrotGetAll() {
        List<Parrot> parrots = new ArrayList<>();
        Parrot p1 = new Parrot("Henry", 1);
        Parrot p2 = new Parrot("Dakota", 2);
        Parrot p3 = new Parrot("Lola", 3);
        parrots.add(p1);
        parrots.add(p2);
        parrots.add(p3);
        return parrots;
    }

    public Parrot parrotById(int id) {
        for (Parrot p : parrotGetAll()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
