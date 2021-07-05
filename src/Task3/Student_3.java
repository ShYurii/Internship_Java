package Task3;

import java.util.Objects;

public class Student_3 extends Student {
    private String name;
    @Override
    void learning() {
        System.out.println("Student "+name+"is learning ");
    }

    public Student_3(String name) {
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
        Student_3 student_3 = (Student_3) o;
        return Objects.equals(name, student_3.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student_3{" +
                "name='" + name + '\'' +
                '}';
    }
}
