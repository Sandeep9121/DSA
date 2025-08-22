package zClasses.basicloops;

import javax.management.MBeanAttributeInfo;

public class switchCaseEvolution {

   enum Month {
       JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
   }
    public static void main(String[] args) {
       Month month=Month.JUN;
     String sss =  switch (month){
         case FEB -> null;
         case JUL,AUG,SEP,MAR,APR,MAY,JUN-> {
               System.out.println(month + " is Rainy");
               yield "raining";
           }
           case OCT,NOV,DEC,JAN->{
                   System.out.println(month + " is Rainy");
         yield "not raining";
     }
       };
    }

    // when you go with yield it should cover all the cases

    
}
