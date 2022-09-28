package hapyfamily4;


import java.util.jar.JarEntry;

public class Main {


    public static void main(String[] args) {
        String habits[] = {"eat", "drink", "sleep"};
        String[][] schedule_F =
                {{DayOfWeek.MONDAY.name(), "Swimming"},
                        {DayOfWeek.TUESDAY.name(), "Camping"},
                        {DayOfWeek.WEDNESDAY.name(), "Billiard"},
                        {DayOfWeek.THURSDAY.name(), "Football"},
                        {DayOfWeek.FRIDAY.name(), "Movie"},
                        {DayOfWeek.SATURDAY.name(), "Concert"},
                        {DayOfWeek.SUNDAY.name(), "Walking"}};


        String[][] schedule_M = {{DayOfWeek.MONDAY.name(), "Cooking"}, {DayOfWeek.TUESDAY.name(), "Cleaning"}, {DayOfWeek.WEDNESDAY.name(), "Sewing"}, {DayOfWeek.THURSDAY.name(), "Yoga"}, {DayOfWeek.FRIDAY.name(), "Movie"}, {DayOfWeek.SATURDAY.name(), "Shopping"}, {DayOfWeek.SUNDAY.name(), "Walking"}};

        Human[] children = new Human[0];
        Human mother = new Woman("Mary", "Johnson", 1980, 100, schedule_M);
        Human father = new Man("Adam", "Johnson", 1970, 100, schedule_F);

        Human son = new Man("Tom", "Johnson", 2000, 90, schedule_F);
        Human daughter = new Woman("Alice", "Johnson", 2002, 90, schedule_M);

        Pet cat = new DomesticCat("Graf", 3, 30, habits);
        Pet dog = new Dog("Rex", 3, 24, habits);
        Pet fish = new Fish("Tuna", 6, 18, habits);

        Family johnson1 = new Family(mother, father, children, cat);
        johnson1.addChild(son);
        johnson1.addChild(daughter);


        System.out.println(johnson1.toString());
        Family johnson2 = new Family(mother, father, children, dog);
        System.out.println(johnson2);


    }

}





