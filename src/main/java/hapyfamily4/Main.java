package hapyfamily4;


import java.util.jar.JarEntry;

public class Main {


    public static void main(String[] args) {
        String habits[] = {"eat", "drink", "sleep"};
        String[][] schedule_F = {
                {DayOfWeek.MONDAY.name(), "Swimming"},
                {DayOfWeek.TUESDAY.name(), "Camping"},
                {DayOfWeek.WEDNESDAY.name(), "Billiard"},
                {DayOfWeek.THURSDAY.name(), "Football"},
                {DayOfWeek.FRIDAY.name(), "Movie"},
                {DayOfWeek.SATURDAY.name(), "Concert"},
                {DayOfWeek.SUNDAY.name(), "Walking"}
        };


        String[][] schedule_M = {
                {DayOfWeek.MONDAY.name(), "Cooking"},
                {DayOfWeek.TUESDAY.name(), "Cleaning"},
                {DayOfWeek.WEDNESDAY.name(), "Sewing"},
                {DayOfWeek.THURSDAY.name(), "Yoga"},
                {DayOfWeek.FRIDAY.name(), "Movie"},
                {DayOfWeek.SATURDAY.name(), "Shopping"},
                {DayOfWeek.SUNDAY.name(), "Walking"}
        };

        Human[] children = new Human[0];
        Human mother = new Woman("Mary", "Johnson", 1980, 100, schedule_M);
        Human father = new Man("Adam", "Johnson", 1970, 100, schedule_F);

        Human son = new Man("Tom", "Johnson", 2000, 90, schedule_F);
        Human daughter = new Woman("Alice", "Johnson", 2002, 90, schedule_M);
        Pet cat = new DomesticCat("Graf", 3, 30, habits);

        Family johnson = new Family(mother, father, children, cat);
        johnson.addChild(son);
        johnson.addChild(daughter);


        System.out.println(johnson.toString());


        Dog myDog = new Dog();
        System.out.println(myDog.familyPets);

        Fish fish = new Fish();
        fish.foul();

        Woman bride = new Woman();
        bride.makeUp();

        Man driver = new Man();
        driver.repairCar();


    }

}





