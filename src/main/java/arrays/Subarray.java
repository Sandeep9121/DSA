package arrays;

import java.util.ArrayList;

public class Subarray{
    private int s1;



    public static void main(String[] args) {


        int ar[]= {1,3,5,7,9,8};
        int size=ar.length;




        for (int i = 0; i <size ; i++) {

            for (int j = i; j <size ; j++) {

                for (int k = i; k <=j ; k++) {
                    System.out.print(ar[k]);
                }
                System.out.print(" ");
            }

            System.out.println();
        }
    }

}
