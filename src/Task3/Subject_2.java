package Task3;

import java.util.Objects;

public class Subject_2 extends Subject {

    private String name;
    private int ID;

    public Subject_2(String name, int ID) {
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
        Subject_2 subject_2 = (Subject_2) o;
        return ID == subject_2.ID &&
                Objects.equals(name, subject_2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "Subject_2{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
