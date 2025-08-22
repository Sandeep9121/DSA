package zClasses.ObjectClone;

public class Student implements  Cloneable {
    private String name;
    private int age;

    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student=null;
        try{
            student= (Student) super.clone();
    } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
    }
       // student.address= (Address) this.address.clone();
        return student;
    }
}
