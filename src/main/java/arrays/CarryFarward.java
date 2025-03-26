package arrays;

public class CarryFarward {



    public static void main(String[] args) {

        String s="aaghhbakgaggzag";
        char[] chars =s.toCharArray();

        int count =0, ans=0;
        int size=chars.length-1;
        for (int j =size; j >=0 ; j--) {
            if(chars[j]=='g') {
                count++;
            }
            if(chars[j]=='a'){
                ans+=count;
            }
        }
        System.out.println("ans"+ans);

    }
}
