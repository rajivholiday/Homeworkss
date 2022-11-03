package new_projects.les3_12.entity;

import java.util.Objects;

public class Parrot {
    private String name;
    private int id;

    public Parrot(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parrot parrot)) return false;
        return id == parrot.id && name.equals(parrot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
