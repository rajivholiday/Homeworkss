package linkedListExercises;

import java.time.LocalTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class IterateReverseOrder {

    public static void iterator(LinkedList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {  // reversing with for loop
            System.out.println(nums.get(i));
        }

        Collections.reverse(nums);                // reversing with collection
        nums.forEach(System.out::println);

        nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
