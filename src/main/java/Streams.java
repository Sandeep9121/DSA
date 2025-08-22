import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        //Stream builder

        Stream<String> s= Arrays.stream(new String[]{"Sandeep","Rayala","is "});

         Stream<String> sb= Stream.<String>builder().add("data").add("Sandeep").build();



        Random random = new Random();
        Stream<Integer> stream =
                Stream.generate(
                        () -> {return random.nextInt(100);} // generating random numbers between 0 and 99
                ).limit(5);


        // Special streams like intStream longStream doubleStream

//        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5, 6)
//                .collect(Collectors.toList());
         // converting the primitive to Object
        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5, 6).boxed().toList();
        // Map to object

        List<Integer> intsObject = IntStream.of(1, 2, 3, 4, 5, 6)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());

        int[] intArray = IntStream.of(1, 2, 3, 4, 5, 6).toArray();
// OR
        int[] intArray2 = IntStream.of(1, 2, 3, 4, 5, 6).toArray();



        List<String> listOfSkills = Arrays.asList("Core Java", "Spring Boot", "Hibernate", "Angular");
        System.out.println( listOfSkills.stream().anyMatch(x->x.equalsIgnoreCase("Spring Boot")));
        System.out.println( listOfSkills.stream().allMatch(x->x.equalsIgnoreCase("Spring Boot")));
        System.out.println( listOfSkills.stream().noneMatch(x->x.equalsIgnoreCase("K")));


        List<String> letters = Arrays.asList("j", "a", "v", "a", "t", "e", "c", "h", "o", "n", "l", "i", "n", "e");
        String result = letters .stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.println(result);

    }
}
