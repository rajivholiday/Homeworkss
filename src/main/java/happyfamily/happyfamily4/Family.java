package happyfamily.happyfamily4;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{ \nmother = %s,\nfather = %s,\nchildren = %s,\npet = %s", mother, father,
                Arrays.toString(children), pet);
    }
    public int countFamily() {
        return 2 + children.length;
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

    public void deleteChild(Human child) {
        Human[] new_arr = Arrays.copyOf(this.children, this.children.length - 1);
        int j = 0;
        for (int i = 0; i < children.length; i++) {
            if (!children[i].equals(child)) {
                new_arr[j++] = children[i];
            }
        }
        this.children = new_arr;
    }

    public void addChild(Human child) {
        this.children = Arrays.copyOf(this.children, this.children.length + 1);
        children[children.length - 1] = child;

    }

}
