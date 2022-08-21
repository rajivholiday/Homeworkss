package happyfamily3;


import Lesson8.WeekDays;

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

        Human mother_b = new Human("Maria", "Balotelli", 1990, 100, schedule_M);
        Human father_b = new Human("Francesko", "Balotelli", 1988, 105, schedule_F);
        Human[] children_b = new Human[3];
        children_b[0] = new Human("Max", "Balotelli", 2000);
        children_b[1] = new Human("Martina", "Balotelli", 2002);

        for (int i = 0; i < 1000000; i++) {
            Human new_Human = new Human();

        }

    }


}
