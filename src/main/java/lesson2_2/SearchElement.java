package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchElement {
    public String word(ArrayList<String> names, int index) {
        return names.get(index);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Tony", "Mike", "Miguel", "Leo"));
        SearchElement searchForName = new SearchElement();
        System.out.println(searchForName.word(names, 3));
        System.out.println(searchForName.word(names, 0));


    }
}
