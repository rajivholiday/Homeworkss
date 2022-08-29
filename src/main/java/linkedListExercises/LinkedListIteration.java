package linkedListExercises;

import java.util.LinkedList;

public class LinkedListIteration {
    public static void iterator(LinkedList<Integer> nums) {
        nums.forEach(n -> System.out.println(n));
        nums.forEach(System.out::println);
        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
