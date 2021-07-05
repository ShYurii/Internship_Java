package Task3;

import java.util.Objects;

public class Student_6 extends Student{
    private String name;
    @Override
    void learning() {
        System.out.println("Student "+name+"is learning ");
    }

    public Student_6(String name) {
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
        Student_6 student_6 = (Student_6) o;
        return Objects.equals(name, student_6.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student_6{" +
                "name='" + name + '\'' +
                '}';
    }
}
