package zClasses.hascode;

import java.util.EnumMap;
import java.util.HashMap;

public class MaintainEqualsHashcodeContractInHashMap {

    public static void main(String[] args) {
        HashMap<ImmutableEmpClass,Integer> map =new HashMap<ImmutableEmpClass,Integer>();
         ImmutableEmpClass e1=new ImmutableEmpClass(1,"Sandeep");
        ImmutableEmpClass e2=new ImmutableEmpClass(1,"Sandeep");

        map.put(e1,200);
        map.put(e2,200);

         map.entrySet().stream().forEach(x->{
             System.out.println(x.getKey()+":"+x.getValue());
         });



         // lets create a hash collision

        HashMap<Employee,Integer> empMap=new HashMap<Employee,Integer>();
        Employee em= new Employee(1,"A");
        Employee em1= new Employee(1,"A");
        Employee em2= new Employee(1,"A");
        Employee em3= new Employee(4,"D");


        empMap.put(em,1);
        empMap.put(em1,1);
        empMap.put(em2,1);
        empMap.put(em3,1);
        //all the above employees sit in one bucket

        empMap.entrySet().stream().forEach(x->{
            System.out.println(x.getKey()+":"+x.getValue());
        });

       ///This shows collisions are not errors, but if you design a bad hashCode(),
        // you’ll cause too many collisions, which hurts performance:
        //Instead of O(1) lookup, it degrades toward O(n) per bucket.


        // Let say Equals method is always giving a false we are try to break the below conditon
        // in Student class we alway return false for equal objects
//        If a.equals(b) is true, then a.hashCode() == b.hashCode() must be true.
// This is mandatory — otherwise collections like HashMap, HashSet, ConcurrentHashMap break.

        Student s=new Student(1,"student");
        Student s1=new Student(1,"student");
        Student s2=new Student(1,"student");

        HashMap<Student,Integer> sMap=new HashMap<Student,Integer>();
        sMap.put(s,1);
        sMap.put(s1,2);
        sMap.put(s2,3);
        System.out.println("Student map with equals is always false ");
        sMap.entrySet().stream().forEach(x->{
            System.out.println(x.getKey()+":"+x.getValue());
        });

        /*
        out put breaking the map duplicate entries
Student{sid=1, name='student'}:1
Student{sid=1, name='student'}:2
Student{sid=1, name='student'}:3
         */
    }
}
