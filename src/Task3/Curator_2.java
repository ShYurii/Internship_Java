package Task3;

import java.util.Objects;

public class Curator_2 extends Curator{

    private String name ;

    @Override
    void observing() {
        System.out.println(name + " is observing students ");
    }

    public Curator_2(String name) {
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
        Curator_2 curator_2 = (Curator_2) o;
        return Objects.equals(name, curator_2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Curator_2{" +
                "name='" + name + '\'' +
                '}';
    }
}
