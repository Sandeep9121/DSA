package imperative;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imperative {

    static class Person{
        private final  String name ;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum  Gender{
        MALE, FEMALE
    }
    public static void main (String[] args) {

        List<Person> people = List.of(
                new Person("Sandeep", Gender.MALE),
                new Person("Laxmi",Gender.FEMALE),
                new Person("Mahesh",Gender.MALE),
                new Person("Suresh",Gender.MALE),
                new Person("Sandhya",Gender.FEMALE)

        );

        // lets imperative approch

        List<Person> female = new ArrayList<>();
        for(Person p: people){
            if(Gender.FEMALE.equals(p.gender)){
                female.add(p);
            }
        }
//        for(Person p:female){
//            System.out.println(p);
//        }

        // declarative approch

        people.stream().filter(x-> Gender.FEMALE.equals(x.gender))
            //    .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
