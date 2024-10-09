package SearchAlgo;

import java.util.ArrayList;
import java.util.List;

public class BinarrySearchAlgo {



    public static int[] search(int [][]a , int target) {
        for (int i = 0; i < a.length; i++) {

            int left=0;
            int right= a[i].length-1;

            while(left<=right){
                int mid=left+right/2;

                if(a[i][mid]==target){
                     return  new int[]{i,mid};
                    }
                else if (a[i][mid]<target) {
                    left =mid+1;

                }else{
                    right=mid-1;
                }
            }

        }
        return new int[]{-1, -1};
    }

    public static int[] binarySearch(int [] a, int n , int target){
        int left=0;
        int right=n-1;
        int result_mid=-1;
        while(left<=right){
            int mid=left+right/2;

            if(a[mid]==target){
                result_mid=mid;
                int lastPostion=mid;
                int firstPosition=mid;
                  int first=0;
                  int last=0;
                while ( lastPostion<n && a[lastPostion]== target){
                    last=lastPostion;
                    lastPostion++;
                }
                while (firstPosition>=0 && a[firstPosition]== target ){
                    first=firstPosition;
                    firstPosition--;
                }
                return new int[] {first,last};
            } else if (a[mid]<target) {
                left =mid+1;

            }else{
                right=mid-1;
            }
        }
        return new int[] {result_mid,result_mid};
    }

    public static int[] binaryUsing2Search(int [] a, int n , int target){
        int left=0;
        int right=n-1;
        int result_mid=-1;
        int first=0;
        int last=0;
        while(left<=right){
            int mid=left+right/2;

            if(a[mid]==target){
                mid--;
            } else if (a[mid]<target) {
                left =mid+1;

            }else{
                right=mid-1;
            }
            first=mid+1;
        }

        while(left<=right){
            int mid=left+right/2;

            if(a[mid]==target){
                mid++;
            } else if (a[mid]<target) {
                left =mid+1;

            }else{
                right=mid-1;
            }
            last=mid-1;

        }

        return new int[] {first,last};
    }

    public static void main(String[] args) {
        System.out.println("i am running");
//        int[] ar = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 888, 888, 999, 999, 999, 999, 1111, 1111};
//        int[] result = binaryUsing2Search(ar, ar.length, 1);
//        for (int i = 0; i < 2; i++) {
//            System.out.println(result[i]);
//        }


        int[][] a = {
                {1, 2, 9},
                {12, 15, 56},
                {79, 89, 91}
        };
         int[] result1= search(a,89);
         for (int i:result1) {
             System.out.println(i);

         }

        }






    }