package Task3;

import java.util.Objects;

public class Curator_1 extends Curator{
   private String name ;

    @Override
    void observing() {
        System.out.println(name + " is observing students ");
    }

    public Curator_1(String name) {
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
        Curator_1 curator_1 = (Curator_1) o;
        return Objects.equals(name, curator_1.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Curator_1{" +
                "name='" + name + '\'' +
                '}';
    }
}
