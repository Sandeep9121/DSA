package arrays;

public class ROugh {

    public static int binarysearch(int[] arr, int k) {
        // Code Here

        int first=0;
        int last=arr.length-1;

        while(first<=last){
            int mid=(first+last)/2;

            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                first= mid+1;
            }else{
                last=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int value=12;
        int index=5;


        System.out.println(binarysearch(new int[]{1,28,36,44,48,64,78,78},1));

    }



}
