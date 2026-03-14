package imperative;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CombineList {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Sachin", "Jadeja"),
                Arrays.asList("Dhoni", "Kohli"),
                Arrays.asList("Rohit")
        );

        List<String> list = listOfLists.stream().flatMap(List::stream).distinct().toList();


    }
}