package happyfamily3;


import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private int count = 2;

    public Family() {

    }


    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;


    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
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

    public void deleteChild1(Human child) {
        Human[] new_arr = Arrays.copyOf(this.children, this.children.length - 1);
        for (int i = 0, j = 0; i < children.length; i++) {
            if (!new_arr[i].equals(child)) {
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
