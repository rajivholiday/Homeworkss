package HappyFamily2;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

}
public void addChild(Human child) {
    this.children = Arrays.copyOf(this.children, this.children.length + 1);


}
