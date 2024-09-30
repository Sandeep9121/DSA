package basic;

import java.util.Scanner;

public class PrintPatterns {

    public static void main(String[] args) {
        //  basic(); // row collum
        // printTillsomeValue();
        // printPyramid();
        //printPyramidNuuuu();
      //  countEvenOdd();

        //hallowPyramid();

        fullNumericPyramid();
    }


    public static void basic() {
        int count = 1;
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                // System.out.print("("+i+","+j+")");
                //System.out.print(i+j);
                //System.out.print(count++);
                System.out.print("*");
            }
            System.out.println();

        }
    }


// print till some value

    public static void printTillsomeValue() {
        System.out.println("enter some will value :::");
        Scanner sc = new Scanner(System.in);
        int final_val = sc.nextInt();
        int val = 1;
        for (int i = 1; val <= final_val; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(val + " ");
                val++;

                if (val > final_val) {
                    break;
                }
            }
            System.out.println();
        }


    }

    public static void printPyramid() {
        System.out.println("enter some will value  Pyramid:::");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();

        }
    }


    public static void printPyramidNuuuu() {
        System.out.println("enter some will number increase :::");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

//            for (int j = 0; j < i; j++) {
//
//                System.out.print(j+i);
//            }
//            for (int j = 1; j < i; j++) {
//
//                System.out.print(2*i-1-j);
//            }

            //my logic

            // lets do with count logic
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;

            }
            count = count - 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();

        }

    }


    public static void countEvenOdd() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int val=0;
        for (int i = 1; i <= n; i++) {

            int val = 0;
            for (int j = 1; j <= i; j++) {
                val = 1 - val;
                System.out.print(val);
            }
            System.out.println();

        }
    }


    public static void hallowPyramid() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i && i==n; j++) {
                System.out.print("*");
            }
            for (int j = i; j >= 1 && i!=n; j--) {
                if ( j == i || j==1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();


        }

    }



    public static void fullNumericPyramid(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(0);
            }

            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;

            }
            count = count - 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(count);
                count--;
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(0);
            }
            System.out.println();




        }
    }
}
