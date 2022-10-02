package happyfamily5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family romero;
    Human mother;
    Human father;
    Human son;
    Human daughter;
    List<Human> children;
    Set<Pet> pets;
    Map<String, String> schedule;


    @BeforeEach
    public void setUp() {
        this.children = new ArrayList<>();
        Human mother = new Woman("Dana", "Romero", 1980);
        Human father = new Man("Sergio", "Romero", 1976);
        this.schedule = null;
        this.pets = null;

        this.son = new Man("Tomas", "Romero", 2000);
        this.daughter = new Woman("Mary", "Romero", 2002);
        children.add(0, son);
        children.add(1, daughter);
        this.romero = new Family(mother, father, children);


    }

    @Test
    void addChildTest() {
        romero.deleteChild(son);
        romero.deleteChild(daughter);

        romero.addChild(son);
        romero.addChild(daughter);
        String result = "Family{ \n" +
                "mother = Human{name = Dana, surname = Romero, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Sergio, surname = Romero, year = 1976, iq = 0, schedule = null},\n" +
                "children = [Human{name = Tomas, surname = Romero, year = 2000, iq = 0, schedule = null}, " + "Human{name = Mary, surname = Romero, year = 2002, iq = 0, schedule = null}],\n" +
                "pet = null";

        assertEquals(result, romero.toString());


    }

    @Test
    void deleteChildTest1() {
        romero.deleteChild(son);
        romero.deleteChild(daughter);
        String result = "Family{ \n" +
                "mother = Human{name = Dana, surname = Romero, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Sergio, surname = Romero, year = 1976, iq = 0, schedule = null},\n" +
                "children = [],\n" +
                "pet = null";
        assertEquals(result, romero.toString());

    }

    @Test
    void deleteChildTest2() {
        romero.deleteChild(children.get(1));
        String result = "Family{ \n" +
                "mother = Human{name = Dana, surname = Romero, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Sergio, surname = Romero, year = 1976, iq = 0, schedule = null},\n" +
                "children = [Human{name = Tomas, surname = Romero, year = 2000, iq = 0, schedule = null}],\n" +
                "pet = null";

        assertEquals(result, romero.toString());


    }

    @Test
    void countFamilyTest() {
        int i = 2 + romero.getChildren().size();
        assertEquals(i, romero.countFamily());
    }

    @Test
    void toStringTest() {
        String result = "Family{ \n" +
                "mother = Human{name = Dana, surname = Romero, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Sergio, surname = Romero, year = 1976, iq = 0, schedule = null},\n" +
                "children = [Human{name = Tomas, surname = Romero, year = 2000, iq = 0, schedule = null}, " + "Human{name = Mary, surname = Romero, year = 2002, iq = 0, schedule = null}],\n" +
                "pet = null";

        assertEquals(result, romero.toString());
    }
}