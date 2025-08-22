package zClasses.ObjectClone;

public class EqualHascodeContract {

    public static void main(String[] args) {

        Employee e1=new Employee(1,"sandeep","kalyanNagar");

        Employee e2=new Employee(2,"sandeep","kalyan");

        Employee e3=e2; // re assgining both  reference are pointing to same object


        Employee e4=new Employee(1,"sandeep","kalyanNagar");

       // reference object it will false
        System.out.println(e1==e2); // false

        System.out.println(e2==e3); // true

        System.out.println("e1.equals(e2)");
        System.out.println(e1.equals(e2)); // false

        System.out.println(e2.equals(e3)); // true

        System.out.println("same content of 2 differnt object");

        System.out.println(e4.equals(e4));


        System.out.println("-----------String   -----");
        String a="Sandeep";
        String b="Sandeep";
        String c=new String ("Sandeep");
        System.out.println(a==b); // literals exists in pool so ideal it should be false because of literal its say
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));

        String x= new String("Sandeep");
        String y= new String("Sandeep");

        System.out.println("----------- with new String   -----");
        System.out.println(x==y);
        System.out.println(x.equals(y));


    }
}
