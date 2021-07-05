package Task3;

import java.util.Objects;

public class Faculty_2 extends Faculty {
    private String name;
    private Cathedra cathedra;

    public Faculty_2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cathedra getCathedra() {
        return cathedra;
    }

    public void setCathedra(Cathedra cathedra) {
        this.cathedra = cathedra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty_2 faculty_2 = (Faculty_2) o;
        return Objects.equals(name, faculty_2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Faculty_2{" +
                "name='" + name + '\'' +
                '}';
    }
}
