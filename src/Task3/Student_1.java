package Task3;

import java.util.Objects;

public class Student_1 extends Student{

    private String name;

    @Override
    void learning() {
        System.out.println("Student "+name+"is learning ");
    }

    public Student_1(String name) {
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
        Student_1 student_1 = (Student_1) o;
        return Objects.equals(name, student_1.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student_1{" +
                "name='" + name + '\'' +
                '}';
    }
}
