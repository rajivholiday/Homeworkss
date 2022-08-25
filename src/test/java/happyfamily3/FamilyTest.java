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
        this.new_Family = new Family(mother, father, children);


    }


    @Test
    void addChildTest() {
        Human roberto = new Human("Roberto", "Rossi", 2005);
        new_Family.addChild(roberto);

        String result = "Family{ \n" +
                "mother = Human{name = Andrea, surname = Rossi, year = 1982, iq = 0, schedule = null},\n" +
                "father = Human{name = Martin, surname = Rossi, year = 1980, iq = 0, schedule = null},\n" +
                "children = [Human{name = Roberto, surname = Rossi, year = 2005, iq = 0, schedule = null}],\n" +
                "pet = null";
        assertEquals(result, new_Family.toString());


    }

    @Test
    void deleteChildTest() {
        Human roberto = new Human("Roberto", "Rossi", 2005);
        new_Family.addChild(roberto);
        new_Family.deleteChild(0);
        String result = "Family{ \n" +
                "mother = Human{name = Andrea, surname = Rossi, year = 1982, iq = 0, schedule = null},\n" +
                "father = Human{name = Martin, surname = Rossi, year = 1980, iq = 0, schedule = null},\n"
                + "children = [],\n" +
                "pet = null";
        assertEquals(result, new_Family.toString());
    }

    @Test
    void deleteChildObjectTest() {

        Human roberto = new Human("Roberto", "Rossi", 2005);
        new_Family.addChild(roberto);
        new_Family.deleteChild(roberto);
        String result1 = "Family{ \n" +
                "mother = Human{name = Andrea, surname = Rossi, year = 1982, iq = 0, schedule = null},\n" +
                "father = Human{name = Martin, surname = Rossi, year = 1980, iq = 0, schedule = null},\n"
                + "children = [],\n" +
                "pet = null";
        assertEquals(result1, new_Family.toString());

    }

    @Test
    void countFamily() {

        Human roberto = new Human("Roberto", "Rossi", 2005);
        new_Family.addChild(roberto);
        int i = 2 + new_Family.getChildren().length;
        assertEquals(3, new_Family.countFamily());

    }
}