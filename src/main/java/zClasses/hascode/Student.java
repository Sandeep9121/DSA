package zClasses.hascode;

import java.util.Objects;

public class Student {

    private int sid;
    private String name;

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }
}

