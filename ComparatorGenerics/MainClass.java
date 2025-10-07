package ComparatorGenerics;

import java.util.*;

public class MainClass 
{
    public static void main(String[] args) 
    {
        List<StudentC> list = new ArrayList<>(List.of(
            new StudentC(3, "Alice"),
            new StudentC(1, "Bob"),
            new StudentC(2, "Charlie")
        ));

        // Collections framework
        Collections.sort(list, new NameComparator()); // sorting method
        System.out.println("Sorted by name: " + list);

        // Using lambda expression instead
        // list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        // System.out.println("Sorted by name (lambda): " + list);
    }
}
