package zClasses.oops;

import java.util.Scanner;

public class TernaryOperation {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in=sc.next();

        int i=sc.nextInt();

        boolean ss1= i==1?true:false;
        String intString= i==1?"Java Mentor":"TIMEPASS";
        String ss= in.equals("sandeep")?"Java Mentor":"TIMEPASS";



        System.out.println(ss);

    }

}
