package linkedListExercises;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateFromSpecificPosition {
    public static void iterator(LinkedList<Integer> nums) {
        Iterator<Integer> it = nums.listIterator(2);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
