package HappyFamily1;
public class Main {
    public static void main(String[] args) {
        String habits[] = {"eat", "drink", "sleep"};
        String[][] schedule = {
                {"Monday", "Swimming"},
                {"Tuesday", "Camping"},
                {"Wednesday", "Billiard"},
                {"Thursday", "Football"},
                {"Friday", "Movie"},
                {"Saturday", "Concert"},
                {"Sunday", "Walking"}
        };

        Pet dog = new Pet("Dog", "Rock", 5, 75, habits);
        Pet cat = new Pet("Cat", "Graf");
        Pet parrot = new Pet();

        Human juniorSon = new Human();
        Human mother = new Human("Jane", "Karleone", 1977);
        Human father = new Human("Vito", "Karleone", 1976);
        Human son = new Human("Michael", "Karleone", 1998, 90, father, mother, dog, schedule);
        Human daughter = new Human("Anna", "Karleone", 2000, father, mother);

        System.out.println(dog.toString());
        System.out.println(daughter.toString() + "\n");
        System.out.println(son.toString());
        System.out.println(cat.toString());
        System.out.println(parrot.toString());
        System.out.println(juniorSon.toString());

        dog.eat();
        dog.respond();
        dog.foul();
        son.greetPet();
        son.describePet();


    }
}