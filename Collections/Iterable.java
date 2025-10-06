package Collections;

import java.util.*;

public class Iterable 
{
    public static void main(String[] args) 
    {
        // Iterable<T> is the root interface for all collection types 
        // List, Set, Queue, etc

        // Any class that implements Iterable can be traversed using an iterator or for-loop

        // Iterable 
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Because List implements Iterable
        for (String name : names) 
        {         
            System.out.println(name);
        }

        // Iterator
        Iterator<String> it = names.iterator();
        while (it.hasNext()) 
        {
            String name = it.next();
            System.out.println(name);
        }

        // Relationship between Iterator and Iterable
        // Iterable<T> -> produces ─> Iterator<T>
        // Iterator<T> -> iterates ─> Elements

        // Iterator methods
        // hasNext()
        // next()
        // remove()

    }
}
