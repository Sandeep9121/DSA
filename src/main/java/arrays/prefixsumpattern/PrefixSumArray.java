package arrays.prefixsumpattern;

public class PrefixSumArray {


    public static void main(String[] args) {
        int[] arr={2,5,-1,3,11,6,9,-3};
        int[] newArray=new int [arr.length];
        newArray[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            newArray[i] = newArray[i-1]+arr[i];
        }

        for (int j : newArray) {
            System.out.print(" " + j);
        }
    }
}


