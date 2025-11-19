package scaler;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateArray {


    // bruteforce
    public static void bruteforceRotate(int []a){
        for (int i = 0; i < 2; i++) {

            int prv = a[0]; //1
            for (int j = 1; j < a.length; j++) {
                int temp = a[j];
                a[j] = prv;
                prv = temp;
            }
            a[0]=prv;
        }
        for (int aa:a){
            System.out.print(" "+aa);
        }

    }

    public static void reverseInn(int a[], int i ,int j){
        while (i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
            i++;

        }

        // i =0 mid


    }
    public static void main(String[] args) {

        int a[] = {1, 132, 4, 3, 7, 99, 12,66};
        // 99,12,1,2,4,3,7
//       // bruteforceRotate(a);

        // reverse technique in the rotation array

         /*
      1 132 4 3 7 99 12 66   // 7 99 12 66 1 132 4 3
       step 1 -66 12  99 7 3 4 132 1
       step 2.1-> 7 99 12 66  step2.2-> 1 132 4 3
 desired output
     7 99 12 66 1 132 4 3
    */

        System.out.println();
        for (int aa:a){
            System.out.print(" "+aa);
        }
        int i =0;
        int j=a.length-1;

        int k=3;

        reverseInn(a,0,j);  // 1 132 4 3 7 99 12 66   // 66 12 99 7 3 4 132 1
        reverseInn(a,0,k-1);  //7 99 12 66   3 4 132 1
        reverseInn(a,k,j);//7 99 12 66 1 132 4 3

         Arrays.stream(a).forEach(x->{
             System.out.print(" "+x);
         });



//
//        for (int i = 0; i < 3; i++) {
//            int temp= a[a.length-1];
//            for (int j = a.length-1; j >0; j--) {
//                    a[j] =a[j-1];
//
//            }
//             a[0]=temp;
//        }
//        for (int aa:a){
//            System.out.print(" "+aa);
//        }

//        for (int aa:a){
//            System.out.print(" "+aa);
//        }
//        System.out.println("\n left rotate");
//        for (int k = 0; k < 4; k++) {
//             int temp =a[0];
//             for(int i=0;i<a.length-1;i++){
//                 a[i]=a[i+1];
//             }
//             a[a.length-1]=temp;
//
//        }
//
//        for (int aa:a){
//            System.out.print(" "+aa);
//        }



    }
}
