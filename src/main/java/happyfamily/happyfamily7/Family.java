package happyfamily.happyfamily7;


import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, List<Human> children, Set<Pet> pet) {
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return mother.equals(family.mother) && father.equals(family.father) && children.equals(family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children);
    }

    @Override
    public String toString() {
        return String.format("Family{ \nmother = %s,\nfather = %s,\nchildren = %s,\npet = %s", mother, father,
                children, pet);
    }

    public int countFamily() {
        return 2 + children.size();
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    public void deleteChild(int index) {
        this.children.remove(index);
    }

    public void deleteChild(Human child) {
        this.children.remove(child);
    }

}
