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
    Human son;
    Human daughter;
    List<Human> children;


    @BeforeEach
    public void setUp() {
        this.children = new ArrayList<>();
        Map<String, String> schedule = new HashMap<>();
        Human mother = new Woman("Dana", "Romero", 1980, 100, schedule);
        Human father = new Man("Sergio", "Romero", 1976, 100, schedule);
        this.son = new Man("Tomas", "Romero", 2000, 90, schedule);
        this.daughter = new Woman("Mary", "Romero", 2002, 88, schedule);
        children.add(0, son);
        children.add(1, daughter);
        this.romero = new Family(father, mother, children);


    }

    @Test
    void addChildTest() {
        assertTrue(romero.toString().contains(children.toString()));



    }

    @Test
    void deleteChildTest1() {
        romero.deleteChild(son);
        romero.deleteChild(daughter);
        assertFalse(romero.toString().contains(son.toString()));
        assertFalse(romero.toString().contains(daughter.toString()));
    }

    @Test
    void deleteChildTest2() {


    }

    @Test
    void countFamilyTest() {
        int i = 2 + romero.getChildren().size();
        assertEquals(i, romero.countFamily());
    }

    @Test
    void toStringTest() {
    }
}