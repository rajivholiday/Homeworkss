package happyfamily.happyfamily8;


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

        Human mother = new Woman("Dorothy", "Obrien", "09/09/1950", 100);
        Human father = new Man("Jack", "Obrien", "07/07/1950", 100);
        Human kid1 = new Man("Tom", "Obrien", "03/05/1975", 100);
        Human kid2 = new Man("Kate", "Obrien", "03/05/1980", 100);
        Human kid3 = new Man("Mike", "Obrien", "03/05/1981", 100);
        Human kid4 = new Man("Alan", "Obrien", "03/05/1976", 100);
        Human kid5 = new Man("Ajay", "Obrien", "03/05/1983", 100);
        Human kid6 = new Man("Vijay", "Obrien", "03/05/1977", 100);

        Family family = controller.createNewFamily(mother, father);
        controller.adoptChild(family, kid1);
        controller.adoptChild(family, kid2);
        controller.adoptChild(family, kid3);
        controller.adoptChild(family, kid4);
        controller.adoptChild(family, kid5);
        controller.adoptChild(family, kid6);

        System.out.println(controller.getAllFamilies());

    }

}





