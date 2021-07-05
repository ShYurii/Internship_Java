package Task3;

import java.util.Objects;

public class Subject_3 extends Subject {
    private String name;
    private int ID;

    public Subject_3(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject_3 subject_3 = (Subject_3) o;
        return ID == subject_3.ID &&
                Objects.equals(name, subject_3.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "Subject_3{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
