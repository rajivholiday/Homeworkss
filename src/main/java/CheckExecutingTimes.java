import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class CheckExecutingTimes {
    public static void printArrWithLoop(ArrayList<String> names1) {
        LocalTime startTime = LocalTime.now();
        for (String i : names1) {
            System.out.println(i);
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(startTime);
        System.out.println(endTime);
        Long differenceInNanos = ChronoUnit.NANOS.between(startTime, endTime);
        System.out.println(differenceInNanos);
    }

    public static void printArrWithWhileLoop(ArrayList<String> names2) {
        LocalTime startTime = LocalTime.now();
        Iterator<String> it = names2.iterator();
        while ((it.hasNext())) {
            System.out.println(it.next());
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(startTime);
        System.out.println(endTime);
        Long differenceInNanos = ChronoUnit.NANOS.between(startTime, endTime);
        System.out.println(differenceInNanos);
    }

    public static void printArrWithIterator(ArrayList<String> names3) {
        LocalTime startTime = LocalTime.now();
        int i = 0;
        while (names3.size() > i) {
            System.out.println(names3.get(i));
            i++;
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(startTime);
        System.out.println(endTime);
        Long differenceInNanos = ChronoUnit.NANOS.between(startTime, endTime);
        System.out.println(differenceInNanos);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Tom");
        arr.add("Max");
        arr.add("Kate");
        arr.add("Alice");
        arr.add("Donna");
        arr.add("Tod");
        arr.add("Vijay");
        arr.add("Tom");
        arr.add("John");
        arr.add("Miguel");

        printArrWithIterator(arr);
        printArrWithLoop(arr);
        printArrWithWhileLoop(arr);
    }
}
