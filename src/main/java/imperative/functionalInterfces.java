package imperative;

import java.util.function.BiFunction;
import java.util.function.Function;

public class functionalInterfces {
    //function interface which only single interface ..

    // Predicate represent boolean value function argument



    public static void main(String[] args) {
        System.out.println(increment(1));
       System.out.println( functionInterfaceByIncrement.apply(1));

       //apply function above we have used .. andThen u can combine by using 2 function at come using andThen
      System.out.println(  functionInterfaceByIncrement.andThen(functionInterfaceByMultiply).apply(2));
     System.out.println(   bifunctionalAdding.andThen(functionInterfaceByMultiply).apply(1,3));
    }

    static int increment(int num){
        return num+1;
    }
    // lets do above  incremental approch

    //Function<T,R> accepts one argument and produces a result;
   static Function<Integer,Integer> functionInterfaceByIncrement = in-> in+1;// functinal Style ..
    static Function<Integer,Integer> functionInterfaceByMultiply = in-> in*7;// functinal Style ..


// ByFunction  int takes 2 input and produce 1 output
  static  BiFunction<Integer,Integer,Integer> bifunctionalAdding = (a,b) -> a+b;



}
