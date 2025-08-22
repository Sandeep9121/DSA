package zClasses.oops;

public class PolymorphismEx {

    // method overloading
    private static int sum(int i, int i1) {
        return i+i1;
    }
    private static int sum(int x, int x2, int i2) {
        return x+x2+i2;
    }
    private static String sum(char i, char i1) {
        return""+i+i1;
    }


    public static void main(String[] args) {

        System.out.println(sum(1,4));
        System.out.println(sum('s','a'));


    }




}
