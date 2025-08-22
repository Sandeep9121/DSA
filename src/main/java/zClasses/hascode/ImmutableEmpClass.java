package zClasses.hascode;

import java.util.Objects;

public class ImmutableEmpClass {

    private final int id;
    private final  String name;

    @Override
    public String toString() {
        return "ImmutableEmpClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ImmutableEmpClass(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
       if(this==obj)
           return true;
       if(obj==null)
           return false;
        ImmutableEmpClass o= (ImmutableEmpClass) obj;

        return this.id==o.id && Objects.equals(name,o.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
