package arrays;

import java.util.ArrayList;

public class SortestSubArray {

    /*
       find Sortest sub array with start and end with max and min of an array ...
     */
    public static void main(String[] args) {

        int[] arr={0,8,0,55,0,1,6,5,13,4,55,6,0,1,7};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }

        }

        ArrayList<Integer> result=new ArrayList<>();
        int w=0; int s=-1;
        int e=-1;
        int ans=Integer.MAX_VALUE; //1
        while(w<arr.length){

            if(arr[w]==min){
                s=w;

            }
            if(arr[w]==max){
                e=w;
            }
         if( s!=-1 && e!=-1 ){
         //   ans=Math.min(ans, Math.max(s,e)-Math.min(s,e) );
             ans=Math.min(ans,Math.abs(s-e)); //1
          if(ans==Math.abs(e-s)){
             result.add(s);
             result.add(e);
             break;
          }

         }
         w++;
        }

        System.out.println(ans +" index:-");
        result.stream().forEach(System.out::print);

    }
}
