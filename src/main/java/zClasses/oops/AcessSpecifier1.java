package zClasses.oops;

public class AcessSpecifier1   {
 // here we are testing final variable can be access by other classes with in the package
    public static void main(String[] args) {
       // can be
        AcessSpecifier ac= new AcessSpecifier();
        System.out.println(ac.n);
  // final methods are also accessible
        AccessFInalMethod  acf=new AccessFInalMethod();
          acf.m1();

          // final class cannot be inherited but it can be accessible
        FinalClass  fc=new FinalClass();
        System.out.println(fc.x);

       FinalConstructor obj=new FinalConstructor();



    }
}
