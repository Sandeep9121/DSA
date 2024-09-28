import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BTC {
    public static ArrayList<ArrayList<Integer>> waysToClimb(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<ArrayList<Integer>>();
        generatePaths(A, ans, finalAns);
        return finalAns;
    }

    private static void generatePaths(int A, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> finalAns) {
        if (A == 0) {
            finalAns.add(new ArrayList<Integer>(ans));
            return;
        }
        if (A >= 1) {
            ans.add(1);
            generatePaths(A - 1, ans, finalAns);
            ans.remove(ans.size() - 1);
        }
        if (A >= 2) {
            ans.add(2);
            generatePaths(A - 2, ans, finalAns);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
//        waysToClimb(3).stream().forEach(x-> {
//
//            x.stream().forEach(y->{
//
//
//            System.out.print(y);
//          });
//
//            System.out.println("");
//
//        });
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        System.out.println(0%1);
    }

    public int gcd(int A, int B) {
        int min= (A<B) ? A:B;
        int gcd =0;
        for(int i=1;i<=min;i++){

            if(A%min==0 && B%min==0 ){
                gcd =i;
            }
        }

        return gcd;
    }
}







