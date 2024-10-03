package arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class AdJArrayDiffernce {
    //Given N elements ,check if difference between any 2 elements =k
    public static void main(String[] args) {

      //  secondMax();
        rotateAnArrayBtimes();

    }


    /*


        Scanner sc=new Scanner(System.in);
        int t=  sc.nextInt();

        for(int i=0;i<=t;i++){
            sc.nextInt();
        }


     */


    /*
    Given an array A of integers of length N, write a program that efficiently finds the second largest element present in the array.
Your program should read input from STDIN and write result to STDOUT.
Your program should print:

The second largest number
"NA" if not applicable or not found
     */

    public static void secondMax(){
        Scanner sc=new Scanner(System.in);
        int t=  sc.nextInt();
        int []ar=new int[t];
        for(int i=0;i<t;i++){
            ar[i]= sc.nextInt();
        }
        int max=ar[0]; int secMax=ar[0];
        for(int i=0;i<t;i++){
            if(max<ar[i]){
                secMax=max;
                max=ar[i];
            }


        }
        if(ar.length>1 && secMax!=max){
            System.out.print(secMax);
        }else{
            System.out.print("NA");
        }


    }



    /*
     Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
     */

      public static void rotateAnArrayBtimes(){
          Scanner sc=new Scanner(System.in);
          int t=  sc.nextInt();
          int []ar=new int[t];
          for(int i=0;i<t;i++){
              ar[i]= sc.nextInt();
          }
           int b= sc.nextInt();
           reverse(ar,0,t-1);
            reverse(ar,0,b-1);
            reverse(ar,b,t-1);

          for (int i = 0; i <  t; i++) {
              System.out.print(ar[i]+" ");
          }
          }



    public static void  reverse(int [] a,int start, int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

       // return a;
    }








    public static void indexOperationAlgo(){
        Scanner sc=new Scanner(System.in);
        int t=  sc.nextInt();
        int []ar=new int[t];
        int[] newA=new int[t];
        for(int i=0;i<t;i++){
            ar[i]= sc.nextInt();
        }


        int b =sc.nextInt();
        for(int j=0;j<t;j++){
            int newIndex= (j+b)%t;   // index+rotateTime % numberOfElements
            newA[newIndex]=ar[j];
        }

        for (int i = 0; i <  t; i++) {
            System.out.print(newA[i]+" ");
        }

    }


      }




