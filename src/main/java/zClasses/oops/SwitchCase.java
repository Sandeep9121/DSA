package zClasses.oops;


import java.util.Scanner;

public class SwitchCase {

    public static String switchcase(Month s){
        String result ="";
        switch (s){
            case NOV,DEC,JAN,FEB:
                result="I am Winter";
                break;
            case MAR,APR,MAY,JUN:
                result="I am summer";
                break;
            case JUL,AUG,SEP,OCT:
                result="I am Monsoon";
                break;
        }

       return  result;
    }


    public static void main(String[] args) {

        System.out.println(switchcase(Month.JUN));

    }
}
