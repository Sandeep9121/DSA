package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,6);

      //  list.stream().filter(n-> Collections.frequency(list,n)>1).forEach(System.out::println);
        //n2 approch

        Set<Integer> num = new HashSet<>();


                list.stream()
                        .filter(e -> !num.add(e))
                        .forEach(System.out::println);



           // String is given asked for non repeating char in that String

          String s="saandeep";

  //        char c=
//          s.chars().mapToObj(a-> (char)a)
//                  .collect(
//                          Collectors.groupingBy(
//                                  b->b ,
//                                  TreeMap::new, Collectors.counting()
//                          )
//                  ).
//                  entrySet().stream()
//                  .filter(x->x.getValue()==1)
//                  .map(Map.Entry::getKey)
//                  .findFirst()
//                  .get();






        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']=  freq[c - 'a']+1;
        }

        System.out.println("-------");
        for(int i = 0; i < freq.length; i++){
               // if(freq[i]>0)
                System.out.print(" "+ freq[i]);

        }

        System.out.println("-------");
        for(char c : s.toCharArray()){
            if(freq[c - 'a'] == 1){
                System.out.println("First non repeating: " + c);

            }
        }

        List<Employee> em = Arrays.asList(
                new Employee(1,"A"),
                new Employee(2,"B"),
                new Employee(3,"C"),
                new Employee(1,"D")
        );

        Map<String, Optional<Employee>> map =
                em.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ));



        String sentence = "java stream api interview questions";

        long count = Arrays.stream(sentence.split(" "))
                .count();



    }
}
