package zClasses.basicloops;

public class Test {

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;   // base case
        return n * factorial(n - 1);      // recursive call
    }


    public static void fibanocii(int size){
        int a=0; int b=1;
        int i=0;
       while(i<size){
           System.out.print(" "+a);
           int temp=a;
           a=a+b;
           b=temp;
           i++;
       }

    }

    public  static int fibanocciRec(int n){
        if(n<=1) return n;
        return  fibanocciRec(n-1) + fibanocciRec(n-2);
    }

    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static String reverse(String s){
        if(s.isEmpty()) return s;
        return reverse(s.substring(1))+s.charAt(0);
    }


    public static void main(String[] args) {
        //System.out.println(factorial(10));

        for (int i = 0; i < 8; i++) {
            System.out.print(" "+fibanocciRec(i));
        }
        System.out.println();

        System.out.println(sum(10));


    }




}
