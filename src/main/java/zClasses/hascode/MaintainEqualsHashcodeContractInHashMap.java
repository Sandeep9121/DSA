package zClasses.hascode;

import java.util.HashMap;

public class MaintainEqualsHashcodeContractInHashMap {

    public static void main(String[] args) {
        HashMap<ImmutableEmpClass,Integer> map =new HashMap<ImmutableEmpClass,Integer>();
         ImmutableEmpClass e1=new ImmutableEmpClass(1,"Sandeep");
        ImmutableEmpClass e2=new ImmutableEmpClass(1,"Sandeep");

        map.put(e1,200);
        map.put(e2,200);

         map.entrySet().stream().forEach(x->{
             System.out.println(x.getKey()+":"+x.getValue());
         });


    }
}
