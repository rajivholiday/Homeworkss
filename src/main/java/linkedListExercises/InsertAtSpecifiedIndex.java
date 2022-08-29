package linkedListExercises;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertAtSpecifiedIndex {
    public static void addElement(LinkedList<String> names,String name, int index){
        names.add(index,name);

    }

    public static void main(String[] args) {
        LinkedList<String> names  = new LinkedList<>(Arrays.asList("Tom", "Jane", "Mike", "Max"));

    }
}
