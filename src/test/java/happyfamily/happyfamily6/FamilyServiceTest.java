package happyfamily.happyfamily6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    Human mother;
    Human father;
    Man son;
    Woman daughter;
    Human mother1;
    Human father1;
    Human son1;
    Human daughter1;
    FamilyService service;

    @BeforeEach
    public void setUp() {
        this.mother = new Human("Dorothy", "Obrien", 1970);
        this.father = new Human("Tom", "Obrien", 1970);
        this.son = new Man("John", "Obrien", 1992);
        this.daughter = new Woman("Kate", "Obrien", 1994);
        this.service = new FamilyService();
        this.mother1 = new Human("Kate", "Johnson", 1970);
        this.father1 = new Human("Jack", "Johnson", 1970);
        this.son1 = new Man("Adam", "Johnson", 1992);
        this.daughter1 = new Woman("Alice", "Johnson", 1994);


    }

    @Test
    void getAllFamilies() {
        Family obrien = service.createNewFamily(mother, father);
        Family johnson = service.createNewFamily(mother1, father1);
        List<Family> families = new ArrayList<>();
        families.add(obrien);
        families.add(johnson);
        assertEquals(families, service.getAllFamilies());


    }


    @Test
    void getFamiliesBiggerThan() {
        Human mother3 = new Woman("Lisa", "Smith", 1960);
        Human father3 = new Man("Gerard", "Smith", 1960);
        Human son3 = new Man("Tomas", "Smith", 1985);
        Human daughter3 = new Woman("Ann", "Smith", 1986);
        Human son3_2 = new Man("Ajay", "Smith", 1990);
        Human daughter3_2 = new Woman("Vijay", "Smith", 1992);
        Family obrien = service.createNewFamily(mother, father);
        Family johnson = service.createNewFamily(mother1, father1);
        Family smith = service.createNewFamily(mother3, father3);
        service.adoptChild(smith, son3);
        service.adoptChild(smith, son3_2);
        service.adoptChild(smith, daughter3);
        service.adoptChild(smith, daughter3_2);
        ArrayList<Family> families = new ArrayList<>();
        families.add(smith);

        assertEquals(families, service.getFamiliesBiggerThan(5));

    }

    @Test
    void getFamiliesLessThan() {
        Human mother3 = new Woman("Lisa", "Smith", 1960);
        Human father3 = new Man("Gerard", "Smith", 1960);
        Human son3 = new Man("Tomas", "Smith", 1985);
        Human daughter3 = new Woman("Ann", "Smith", 1986);
        Human son3_2 = new Man("Ajay", "Smith", 1990);
        Human daughter3_2 = new Woman("Vijay", "Smith", 1992);
        Family obrien = service.createNewFamily(mother, father);
        Family johnson = service.createNewFamily(mother1, father1);
        Family smith = service.createNewFamily(mother3, father3);
        service.adoptChild(smith, son3);
        service.adoptChild(smith, son3_2);
        service.adoptChild(smith, daughter3);
        service.adoptChild(smith, daughter3_2);
        ArrayList<Family> families = new ArrayList<>();
        families.add(obrien);
        families.add(johnson);
        assertEquals(families, service.getFamiliesLessThan(5));
    }

    @Test
    void countFamiliesWithMemberNumber() {
        Human mother3 = new Woman("Lisa", "Smith", 1960);
        Human father3 = new Man("Gerard", "Smith", 1960);
        Human son3 = new Man("Tomas", "Smith", 1985);
        Human daughter3 = new Woman("Ann", "Smith", 1986);
        Human son3_2 = new Man("Ajay", "Smith", 1990);
        Human daughter3_2 = new Woman("Vijay", "Smith", 1992);
        Family smith = service.createNewFamily(mother3, father3);
        service.adoptChild(smith, son3);
        service.adoptChild(smith, son3_2);
        service.adoptChild(smith, daughter3);
        service.adoptChild(smith, daughter3_2);

        assertEquals(1, service.countFamiliesWithMemberNumber(6));

    }

    @Test
    void createNewFamily() {
        Family obrien = service.createNewFamily(mother, father);
        assertEquals(1, service.getAllFamilies().size());


    }

    @Test
    void deleteFamilyByIndex() {
        Family obrien = service.createNewFamily(mother, father);
        Family johnson = service.createNewFamily(mother1, father1);
        List<Family> families = new ArrayList<>();
        families.add(johnson);
        service.deleteFamilyByIndex(0);
        assertEquals(families, service.getAllFamilies());


    }

    @Test
    void adoptChild() {
        Family obrien = service.createNewFamily(mother, father);
        service.adoptChild(obrien, son);
        assertEquals(3, service.getFamilyById(0).countFamily());
    }

    @Test
    void deleteAllChildrenOlderThan() {
        Human mother1 = new Woman("Beatrice", "Moretti", 1976);
        Human father1 = new Man("Marco", "Moretti", 1975);
        Human son1 = new Man("Luca", "Moretti", 2000);
        Human daughter1 = new Woman("Sofia", "Moretti", 2002);

        Human mother2 = new Human("Dorothy", "Obrien", 1955);
        Human father2 = new Human("Jack", "Obrien", 1950);
        Human son2 = new Man("Anthony", "Obrien", 1975);
        Human daughter2 = new Woman("Jenny", "Obrien", 1980);

        Family obrien = service.createNewFamily(mother1, father1);
        Family johnson = service.createNewFamily(mother2, father2);
        service.adoptChild(johnson, son2);
        service.adoptChild(johnson, daughter2);

        service.deleteAllChildrenOlderThan(1981);

        String s = "[Family{ \n" +
                "mother = Human{name = Beatrice, surname = Moretti, year = 1976, iq = 0, schedule = null},\n" +
                "father = Human{name = Marco, surname = Moretti, year = 1975, iq = 0, schedule = null},\n" +
                "children = [],\n" +
                "pet = [], Family{ \n" +
                "mother = Human{name = Dorothy, surname = Obrien, year = 1955, iq = 0, schedule = null},\n" +
                "father = Human{name = Jack, surname = Obrien, year = 1950, iq = 0, schedule = null},\n" +
                "children = [Human{name = Anthony, surname = Obrien, year = 1975, iq = 0, schedule = null}, Human{name = Jenny, surname = Obrien, year = 1980, iq = 0, schedule = null}],\n" +
                "pet = []]";
        assertEquals(s, service.getAllFamilies().toString());

    }

    @Test
    void count() {
        Family obrien = service.createNewFamily(mother, father);
        service.adoptChild(obrien, son);
        assertEquals(1, service.count());


    }

    @Test
    void getFamilyById() {
        Family obrien = service.createNewFamily(mother, father);
        Family johnson = service.createNewFamily(mother1, father1);
        assertEquals(johnson, service.getFamilyById(1));


    }

    @Test
    void getPets() {
        Family obrien = service.createNewFamily(mother, father);
        Set<String> habits = new HashSet<>(Arrays.asList("Eat", "Drink", "Sleep"));
        Pet dog = new Dog("Rex", 2, 20, habits);
        Set<Pet> pets = new HashSet<>();
        pets.add(dog);
        obrien.setPet(pets);
        assertEquals(pets, service.getFamilyById(0).getPet());


    }

    @Test
    void addPet() {
        Family obrien = service.createNewFamily(mother, father);
        Family johnson = service.createNewFamily(mother1, father1);
        Set<String> habits = new HashSet<>(Arrays.asList("Eat", "Drink", "Sleep"));
        Pet dog = new Dog("Rex", 2, 20, habits);
        service.addPet(1, dog);
        String expected = "Family{ \n" +
                "mother = Human{name = Kate, surname = Johnson, year = 1970, iq = 0, schedule = null},\n" +
                "father = Human{name = Jack, surname = Johnson, year = 1970, iq = 0, schedule = null},\n" +
                "children = [],\n" +
                "pet = [DOG{ nickname = Rex, age = 2, tricklevel = 20, habits = [Sleep, Eat, Drink] }]";

        assertEquals(expected, service.getFamilyById(1).toString());


    }
}
