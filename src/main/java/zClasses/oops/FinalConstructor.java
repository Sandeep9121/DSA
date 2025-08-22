package zClasses.oops;

public class FinalConstructor {

    int c=11;
    int c2=10;

   final FinalConstructor obj=new FinalConstructor();

//    final  FinalConstructor(){
//       c=12;
//       c2=22;
//    }

    // we cannot use final for the constructor

    // how we can restrict object creation

  // same like variable object cannot be modified further
    public FinalConstructor(){
        FinalConstructor obj2= new FinalConstructor();
       // obj=obj2;  CTE compile time error

    }



}
