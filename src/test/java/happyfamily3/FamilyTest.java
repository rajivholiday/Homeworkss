package happyfamily3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family new_Family;

    @BeforeEach
    public void setUp() {
        Human mother = new Human("Andrea", "Rossi", 1982);
        Human father = new Human("Martin", "Rossi", 1980);
        Human[] children = new Human[0];
        Family rossi = new Family(mother, father, children);

    }


    @Test
    void addChildTest() {
        Human mother = new Human("Andrea", "Rossi", 1980);
        Human father = new Human("Martin", "Rossi", 1978);
        Human[] children = new Human[0];
        Family rossi = new Family(mother, father, children);
        Human roberto = new Human("Roberto", "Rossi", 2005);
        rossi.addChild(roberto);

        String result = "Family{ \n" +
                "mother = Human{name = Andrea, surname = Rossi, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Martin, surname = Rossi, year = 1978, iq = 0, schedule = null},\n" +
                "children = [Human{name = Roberto, surname = Rossi, year = 2005, iq = 0, schedule = null}],\n" +
                "pet = null";
        assertEquals(result, rossi.toString());


    }

    @Test
    void deleteChildTest() {
        Human mother = new Human("Andrea", "Rossi", 1980);
        Human father = new Human("Martin", "Rossi", 1978);
        Human[] children = new Human[0];
        Family rossi = new Family(mother, father, children);
        Human roberto = new Human("Roberto", "Rossi", 2005);
        rossi.addChild(roberto);
        rossi.deleteChild(0);
        String result = "Family{ \n" +
                "mother = Human{name = Andrea, surname = Rossi, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Martin, surname = Rossi, year = 1978, iq = 0, schedule = null},\n"
                + "children = [],\n" +
                "pet = null";
        assertEquals(result, rossi.toString());
    }
    @Test
    void deleteChildObjectTest(){
        Human mother = new Human("Andrea", "Rossi", 1980);
        Human father = new Human("Martin", "Rossi", 1978);
        Human[] children = new Human[0];
        Family rossi = new Family(mother, father, children);
        Human roberto = new Human("Roberto", "Rossi", 2005);
        rossi.addChild(roberto);
        rossi.deleteChild1(roberto);
        String result1 = "Family{ \n" +
                "mother = Human{name = Andrea, surname = Rossi, year = 1980, iq = 0, schedule = null},\n" +
                "father = Human{name = Martin, surname = Rossi, year = 1978, iq = 0, schedule = null},\n"
                + "children = [],\n" +
                "pet = null";
        assertEquals(result1, rossi.toString());

    }

    @Test
    void countFamily() {
        Human mother = new Human("Andrea", "Rossi", 1980);
        Human father = new Human("Martin", "Rossi", 1978);
        Human[] children = new Human[0];
        Family rossi = new Family(mother, father, children);
        Human roberto = new Human("Roberto", "Rossi", 2005);
        rossi.addChild(roberto);
        int i = 2 + children.length;
        assertEquals(3, rossi.countFamily());

    }
}