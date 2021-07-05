package Task3;

import java.util.Objects;

public class Specialisation_2 extends Specialisation{
    private  String name;

    public Specialisation_2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialisation_2 that = (Specialisation_2) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Specialisation_2{" +
                "name='" + name + '\'' +
                '}';
    }
}

