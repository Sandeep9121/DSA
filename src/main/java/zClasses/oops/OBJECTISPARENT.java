package zClasses.oops;

import java.util.Collections;

public class OBJECTISPARENT {

     int  x=10;

     public void m(){
         System.out.println("aaaaa");
     }
    public static void main(String[] args) throws CloneNotSupportedException {
         //hashcode native ?? is something that implementation was written in C or c++

        OBJECTISPARENT obj=new OBJECTISPARENT();
        System.out.println("obj ---"+obj.hashCode());

        OBJECTISPARENT obj2=new OBJECTISPARENT();
        System.out.println(obj2.hashCode());



        System.out.println(obj==obj2);
        System.out.println("obj2 ---"+obj.equals(obj2));


      //  int x= (int)10.f;  example of types

        //clone
        OBJECTISPARENT obj3 = (OBJECTISPARENT) obj2.clone(); // type casting
        System.out.println("obj3 ---"+obj3);

    }
}
