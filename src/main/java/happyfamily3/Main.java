package happyfamily3;


public class Main {


    public static void main(String[] args) {
        String habits[] = {"eat", "drink", "sleep"};
        String[][] schedule_F = {
                {"Monday", "Swimming"},
                {"Tuesday", "Camping"},
                {"Wednesday", "Billiard"},
                {"Thursday", "Football"},
                {"Friday", "Movie"},
                {"Saturday", "Concert"},
                {"Sunday", "Walking"}
        };
        String[][] schedule_M = {
                {"Monday", "Cooking"},
                {"Tuesday", "Cleaning"},
                {"Wednesday", "Sewing"},
                {"Thursday", "Yoga"},
                {"Friday", "Movie"},
                {"Saturday", "Shopping"},
                {"Sunday", "Walking"}
        };

        Human[] children = new Human[0];

        Human mother = new Human("Jane", "Gomes", 1980);
        Human father = new Human("Mario", "Gomes", 1978);

        Human mother_b = new Human("Maria", "Balotelli", 1990, 100, schedule_M);
        Human father_b = new Human("Francesko", "Balotelli", 1988, 105, schedule_F);
        Human[] children_b = new Human[3];
        children_b[0] = new Human("Max", "Balotelli", 2000);
        children_b[1] = new Human("Martina", "Balotelli", 2002);






    }
}