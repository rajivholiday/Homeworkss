package happyfamily.happyfamily6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> habits = new HashSet<>(Arrays.asList("Eat", "Drink", "Sleep"));

        Map<String, String> schedule_F = new HashMap<>();
        schedule_F.put(DayOfWeek.MONDAY.name(), "Swimming");
        schedule_F.put(DayOfWeek.TUESDAY.name(), "Camping");
        schedule_F.put(DayOfWeek.WEDNESDAY.name(), "Billiard");
        schedule_F.put(DayOfWeek.THURSDAY.name(), "Football");
        schedule_F.put(DayOfWeek.FRIDAY.name(), "Movie");
        schedule_F.put(DayOfWeek.SATURDAY.name(), "Concert");
        schedule_F.put(DayOfWeek.SUNDAY.name(), "Walking");

        Map<String, String> schedule_M = new HashMap<>();
        schedule_M.put(DayOfWeek.MONDAY.name(), "Cleaning");
        schedule_M.put(DayOfWeek.THURSDAY.name(), "Sewing");
        schedule_M.put(DayOfWeek.WEDNESDAY.name(), "Yoga");
        schedule_M.put(DayOfWeek.THURSDAY.name(), "Exercising");
        schedule_M.put(DayOfWeek.FRIDAY.name(), "Movie");
        schedule_M.put(DayOfWeek.SATURDAY.name(), "Shopping");
        schedule_M.put(DayOfWeek.SUNDAY.name(), "Walking");


        Pet dog = new Dog("Rex", 2, 20, habits);
        Pet cat = new Robocat("Graf", 2, 20, habits);

        FamilyController controller = new FamilyController();

        Human mother1 = new Woman("Beatrice", "Moretti", 1976);
        Human father1 = new Man("Marco", "Moretti", 1975);
        Human son1 = new Man("Luca", "Moretti", 2000);
        Human daughter1 = new Woman("Sofia", "Moretti", 2002);

        Human mother2 = new Human("Dorothy", "Obrien", 1955);
        Human father2 = new Human("Jack", "Obrien", 1950);
        Human son2 = new Man("Anthony", "Obrien", 1975);
        Human daughter2 = new Woman("Jenny", "Obrien", 1980);

        Human mother3 = new Human("Ann", "Westphalen", 1970);
        Human father3 = new Human("Edward", "Westphalen", 1970);
        Human son3 = new Man("Bill", "Westphalen", 1995);
        Human daughter3 = new Woman("Sarah", "Westphalen", 1998);
        Human daughter3_1 = new Woman("Alice", "Westphalen", 2000);

        FamilyService service = new FamilyService();

        Family family1 = service.createNewFamily(mother1, father1);

        Family family2 = service.createNewFamily(mother2, father2);
        service.adoptChild(family2, son2);
        service.adoptChild(family2, daughter2);

        service.addPet(0, dog);
        System.out.println(service.getFamilyById(0).toString());


//        controller.displayAllFamilies();
//        controller.deleteFamilyByIndex(0);
//        controller.displayAllFamilies();


    }

}





