package Task3;

import java.util.Objects;

public class Lecturer_1 extends Lecturer{
   private String name;
   private Subject subject;

    @Override
    void teaching() {

        System.out.println(name + " teaching subject" );
    }

    public Lecturer_1(String name) {
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
        Lecturer_1 that = (Lecturer_1) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Lecturer_1{" +
                "name='" + name + '\'' +
                '}';
    }
}
