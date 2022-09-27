package happyfamily5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> habits = new HashSet<>(Arrays.asList("Eat", "Drink", "Sleep"));
        Set<Pet> pets = new HashSet<>();
        Pet cat = new DomesticCat("Graf", 3, 30, habits);
        Pet dog = new Dog("Rex", 3, 24, habits);
        Pet fish = new Fish("Tuna", 6, 18, habits);

        pets.add(cat);
        pets.add(dog);
        pets.add(fish);


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
        schedule_M.put(DayOfWeek.THURSDAY.name(), "Yoga");
        schedule_M.put(DayOfWeek.FRIDAY.name(), "Movie");
        schedule_M.put(DayOfWeek.SATURDAY.name(), "Shopping");
        schedule_M.put(DayOfWeek.SUNDAY.name(), "Walking");

        List<Human> children = new ArrayList<>();
        Human mother = new Woman("Mary", "Johnson", 1980, 100, schedule_M);
        Human father = new Man("Adam", "Johnson", 1970, 100, schedule_F);

        Human son = new Man("Tom", "Johnson", 2000, 90, schedule_F);
        Human daughter = new Woman("Alice", "Johnson", 2002, 90, schedule_M);


        Family johnson1 = new Family(mother, father, children, pets);
        johnson1.addChild(son);
        johnson1.addChild(daughter);


        System.out.println(johnson1.toString());
        Family johnson2 = new Family(mother, father, children, pets);
        System.out.println(johnson2);


    }

}





