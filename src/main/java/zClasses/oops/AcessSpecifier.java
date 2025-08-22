package zClasses.oops;


public class AcessSpecifier {

   // what happens if I declared variable

    final static String st="Constant";
     int n=10;
    //static int x=11;

    //  if you forgot initial we can use constructor for intialization for non static
    final   int r;
    AcessSpecifier(){
        r=200;
    }

    //  if you forgot initial we can use static block for intialization for  static
  final  static int  p ;
    static {
        p=10;
    }





    // curd   ... create update retrieve delete
    public static void main(String[] args) {
        AcessSpecifier ob=new AcessSpecifier();

        final int  x =ob.n;
         //x=12; // we converted normal varaible to final in above statement CTE
       // st="i m not constant";  // CTE compile time error final variable cannot be modified
        System.out.println();

    }

}
