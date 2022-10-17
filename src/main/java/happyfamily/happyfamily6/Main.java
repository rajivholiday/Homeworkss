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


        FamilyController controller = new FamilyController();
        Human father = new Man("Marco", "Moretti", 1975);
        Human mother = new Woman("Beatrice", "Moretti", 1976);

        List<Human> children = new ArrayList<>();
        List<Family> families = new ArrayList<>();
        Human son = new Man("Luca", "Moretti", 2000);
        Human daughter = new Woman("Sofia", "Moretti", 2002);
        Family moretti = new Family(mother, father, children);
        children.add(son);
        children.add(daughter);

        CollectionFamilyDao dao = new CollectionFamilyDao();
        dao.save(moretti);
        families.add(moretti);


        System.out.println(dao.getAll());



    }

}





