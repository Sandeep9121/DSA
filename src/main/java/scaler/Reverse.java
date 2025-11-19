package scaler;

public class Reverse {


    /*
       this is simple reverse in O(n)
     */
    public static void reverse(int []arr){


//        for (int l = 0; l < arr.length-1; l++) {
//            System.out.print(" "+arr[l]);
//        }

    }



    public static void reverse(int []arr, int i , int j){
        int k=0;

        while (i<j){
            k=arr[i];
            arr[i]=arr[j];
            arr[j]=k;
            i++;
            j--;
        }

        for (int l = 0; l < arr.length; l++) {
            System.out.print(" "+arr[l]);
        }

    }
    /*
        Given an array having start and end index i j reverse from element from the start index to end index

     */



    public static void main(String[] args) {

    int []input={5,2,1,3,5,7,9,22,31,0,-1,4};
                //4 -1 0 7 9 22 31 5 3 1 2
       // reverse(input);
        reverse(input,6,9);

        //rotate the array n to k times
        

    }
}
