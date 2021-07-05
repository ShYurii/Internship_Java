package Task3;

import java.util.Objects;

public class Lecturer_3  extends Lecturer{
  private   String name;
  private Subject subject;

    @Override
    void teaching() {
        System.out.println(name + " teaching subject" );
    }

    public Lecturer_3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecturer_3 that = (Lecturer_3) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Lecturer_3{" +
                "name='" + name + '\'' +
                '}';
    }
}
