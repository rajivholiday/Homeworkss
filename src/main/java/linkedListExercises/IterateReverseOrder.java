package linkedListExercises;

import java.util.Collections;
import java.util.LinkedList;

public class IterateReverseOrder {

    public static void iterator(LinkedList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }

        Collections.reverse(nums);
        nums.forEach(n -> System.out.println(n));

        nums.stream().sorted(Collections.reverseOrder()).forEach(n -> System.out.println(n));
    }
}
