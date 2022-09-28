package happyfamily5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family romero;


    @BeforeEach
    public void setUp() {
        List<Human> children = new ArrayList<>();
        Map<String, String> schedule = new HashMap<>();
        Human mother = new Woman("Dana", "Romero", 1980, 100, schedule);
        Human father = new Man("Sergio", "Romero", 1976, 100, schedule);
        Human son = new Man("Tomas", "Romero", 2000, 90, schedule);
        Human daughter = new Woman("Mary", "Romero", 2002, 88, schedule);
        this.romero = new Family(father, mother, children);
        children.add(son);
        children.add(daughter);


    }

    @Test
    void addChildTest() {


    }

    @Test
    void deleteChildTest1() {
    }

    @Test
    void deleteChildTest2() {
    }

    @Test
    void countFamilyTest() {
    }

    @Test
    void toStringTest() {
    }
}