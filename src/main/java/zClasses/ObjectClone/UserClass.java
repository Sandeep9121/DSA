package zClasses.ObjectClone;

public class UserClass {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address ad=new Address("2-224","Kalyan Nagar","560053");
        Student s=new Student("Sandeep",23,ad);

        Student s3= null;
        s3 = (Student) s.clone();
        System.out.println(s3.getAddress().hashCode());
        System.out.println(s.getAddress().hashCode());


        //shallow cloning deepCloning
    }
}
