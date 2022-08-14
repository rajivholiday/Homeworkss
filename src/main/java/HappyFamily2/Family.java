package HappyFamily2;

import java.util.Arrays;

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

    public void deleteChild(int index) {
        this.children = Arrays.copyOf(this.children, this.children.length - 1);

    }

    @Override
    public String toString() {
        return String.format("Family{ \nmother = %s,\nfather = %s,\nchildren = %s,\npet = %s", mother, father,
                Arrays.toString(children), pet);
    }
}
