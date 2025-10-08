package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPractice 
{
    public static void main(String[] args) 
    {
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        ListIterator<String> it = names.listIterator();

        System.out.println("Forward Traversal:");
        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }

        System.out.println("\nBackward Traversal:");
        while (it.hasPrevious()) 
        {
            System.out.println(it.previous());
        }

        // you can modify items while iterating
        // using add(), set() methods inside of ListIterator
    }
}
