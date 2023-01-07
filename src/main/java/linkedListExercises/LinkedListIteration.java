package linkedListExercises;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteration {
    public static void iterator(LinkedList<Integer> nums) {
        nums.forEach(System.out::println);
        for (Integer i : nums) System.out.println(i);

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
