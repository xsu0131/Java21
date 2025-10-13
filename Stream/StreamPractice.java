package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice
{
    // sequence of elements from a collection, array, or I/O channel

    // supports functional-style operations such as filtering, mapping, and reducing

    // IT IS NOT A DATA STRUCTURE, it doesn't store elements. It operates on data from a source

    // Source (where data comes from): List, Set, Map, array

    // Intermediate operations — transform the data: filter(), map(), sorted(), distinct()

    // Terminal operation - produce a result: forEach(), collect(), count(), reduce()

    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        long count = numbers.stream()        // Source
                .filter(n -> n % 2 == 0) // Intermediate
                .count();                // Terminal

        System.out.println(count);

        // Filter and collect (collect even numbers)
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evens);

        // Map (Transform Each Element)
        List<String> names = List.of("Bob", "Alice", "Charlie");

        List<Integer> lengths = names.stream()
                .map(String::length)
                .toList(); // Java 16+ shortcut

        System.out.println(lengths);

        // Reduce (Combine into One Result)
        List<Integer> nums = List.of(1, 2, 3, 4);

        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        // Sorting
        List<String> sorted = names.stream()
                .sorted()
                .toList();
        System.out.println(sorted);

        // Chaining
        List<String> result = names.stream()
                .filter(n -> n.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);
    }

}
