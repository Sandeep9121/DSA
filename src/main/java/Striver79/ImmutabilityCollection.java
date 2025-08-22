package Striver79;

import java.util.Map;

public class ImmutabilityCollection {
    public record Person(String name, int age) {}
    public static void main(String[] args) {



                Map<Integer, Person> immutableMap = Map.of(
                        1, new Person("Alice", 25),
                        2, new Person("Bob", 30)
                );

                System.out.println(immutableMap);



    }



}


