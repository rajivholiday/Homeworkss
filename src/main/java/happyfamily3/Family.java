package happyfamily3;

import HappyFamily2.Human;
import HappyFamily2.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private HappyFamily2.Human mother;
    private HappyFamily2.Human father;
    private HappyFamily2.Human[] children;
    private HappyFamily2.Pet pet;
    private int count = 2;

    public Family(HappyFamily2.Human mother, HappyFamily2.Human father, HappyFamily2.Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;


    }

    public HappyFamily2.Human getMother() {
        return mother;
    }

    public void setMother(HappyFamily2.Human mother) {
        this.mother = mother;
    }

    public HappyFamily2.Human getFather() {
        return father;
    }

    public void setFather(HappyFamily2.Human father) {
        this.father = father;
    }

    public HappyFamily2.Human[] getChildren() {
        return children;
    }

    public void setChildren(HappyFamily2.Human[] children) {
        this.children = children;
    }

    public HappyFamily2.Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(HappyFamily2.Human child) {
        this.children = Arrays.copyOf(this.children, this.children.length + 1);
        children[children.length - 1] = child;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return mother.equals(family.mother) && father.equals(family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    public void deleteChild(int index) {
        Human[] new_arr = Arrays.copyOf(this.children, this.children.length - 1);
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                new_arr[j++] = children[i];

            }

        }
        this.children = new_arr;
    }

    public int countFamily() {
        return count + children.length;
    }

    @Override
    public String toString() {
        return String.format("Family{ \nmother = %s,\nfather = %s,\nchildren = %s,\npet = %s", mother, father,
                Arrays.toString(children), pet);
    }
}
