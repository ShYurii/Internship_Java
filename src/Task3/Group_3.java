package Task3;

import java.util.Objects;

public class Group_3 extends Group {
    private String name;
    private Student student;
    private Curator curator;
    private Subject subject;
    private Specialisation specialisation;

    public Group_3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Curator getCurator() {
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Specialisation getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(Specialisation specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group_3 group_3 = (Group_3) o;
        return Objects.equals(name, group_3.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Group_3{" +
                "name='" + name + '\'' +
                '}';
    }
}