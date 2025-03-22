package arrays;

public class RangeSumQuery {

    /*
        Given an integer N [-3,6,2,4,5,2,8,-9,3,1] ... L_R range [5,8] [3,7] [1,3] [0,4] ,[7,7]
     */

    public static void main(String[] args) {

        int range[][] = {{5,8},{3,7},{1,3},{0,4},{7,7},{9,9}}; //index or || number of sequence
        int n[]={-3,6,2,4,5,2,8,-9,3,1};

        int sum[]=new int[range.length];//empty
       //brute force approch
        for (int i = 0; i < range.length; i++) {
            for (int j =range[i][0]; j <= range[i][1]; j++) {
                sum[i] += n[j];
            }
        }

        //validate print the result
        for (int i = 0; i < sum.length; i++) {
            //hashcode pojo toString ..
            System.out.print(sum[i]+" ");
        }

        //-------------------- optimal using prefix sum -------
        int sum2[]=new int[range.length];
        int pr[]=new int[n.length];

        pr[0]=n[0];
        for (int i = 1; i < n.length; i++) {
            pr[i]=n[i]+pr[i-1];
        }
        for (int i = 0; i < range.length; i++) {
            int l =range[i][0];//first index
            int r= range[i][1];//last index

            if(l==0){
                sum2[i]=pr[r]; //00
            }else{
                /*
                explanation
                    pr[r] ----------------->
                   pr[l-1] -------->5      8
                int n[]={-3,6,2,4,5,2,8,-9,3,1};

                 */
                sum2[i]=pr[r]-pr[l-1];
            }
        }
        System.out.println("  Using the prefix");
        for (int i = 0; i < sum2.length; i++) {
            //hashcode pojo toString ..

            System.out.print(sum2[i]+" ");
        }



    }
}
