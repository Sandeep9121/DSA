package imperative;

import java.util.*;
import java.util.stream.Collectors;

public class Java8features {

    public static void main(String[] args) {





        Map<String, Integer> batterSalary = new HashMap<>();
        batterSalary.put("Sachin", 1000);
        batterSalary.put("Dhoni", 1200);
        batterSalary.put("Kohli", 1100);
        batterSalary.put("Rohit", 900);
        batterSalary.put("Jadeja", 950);
        batterSalary.put("Jadeja", 950);
        batterSalary.put("Jadeja1", 950);
        batterSalary.put("Jadeja2", 950);

//       String name= batterSalary.entrySet().stream().sorted((o1,o2)-> o2.getValue()- o1.getValue()).v
//        System.out.println(name);

        // Group keys by their values
        Map<Integer, List<String>> valueToKeys = batterSalary.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Map.Entry::getValue,
                                Collectors.mapping(
                                        Map.Entry::getKey,
                                        Collectors.toList()
                                )
                        )
                );


        for(Map.Entry<Integer,List<String>> map: valueToKeys.entrySet()){
                   if(map.getValue().size()>1){
                        System.out.println(map.getKey());
                        map.getValue().forEach(System.out::println);
                   }
        }

          valueToKeys.entrySet().stream().filter(x->x.getValue().size()>1).forEach(
                  x->{
                      System.out.println(x.getKey());
                      x.getValue().forEach(System.out::println);
                  }
          );


    }
}
