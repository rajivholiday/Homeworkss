package hapyfamily4;


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


        Human mother = new Human("Jane", "Gomes", 1980);
        Human father = new Human("Mario", "Gomes", 1978);

        Human mother_b = new Human("Maria", "Romano", 1990, 100, schedule_M);
        Human father_b = new Human("Francesko", "Romano", 1988, 105, schedule_F);
        Human[] children_b = new Human[2];
        children_b[0] = new Human("Max", "Romano", 2000);
        children_b[1] = new Human("Martina", "Romano", 2002);
        Human luka = new Human("Luka", "Romano", 2004);

        Family romano = new Family(mother_b, father_b, children_b);
        romano.addChild(luka);
        romano.deleteChild(luka);
        System.out.println(romano.toString());


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





