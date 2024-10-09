package arrays;

public class SecondLargest {

    public static int findSecondLargest(int []a){
        int firstLargest=-1,secondLargest=-1;
        for (int i = 0; i < a.length; i++) {
            if(firstLargest<a[i]){
                firstLargest=a[i];
            }
        }
        // above will give the first larget run again loop to find the 2nd largest

        for (int i = 0; i < a.length; i++) {
            if(secondLargest<a[i] && a[i]!=firstLargest){
                secondLargest=a[i];
            }
        }


        return secondLargest;

    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int []{23,11,13,55,66,77,888,888}));
    }
}
