package Iterator;

import java.util.*;

// public interface Iterator<E> 
// {
//     boolean hasNext();   
//     E next();           
//     void remove();       
// }

public class IteratorPractice 
{
    public static void main(String[] args) 
    {
        // List<String> list = List.of("Java", "Python", "C++");

        // Iterator<String> it = list.iterator();

        // while (it.hasNext()) 
        // {
        //     String lang = it.next();
        //     System.out.println(lang);
        // }

        // Another example, iterator with modifications
        List<String> langs = new ArrayList<>(List.of("Java", "Python", "C++"));

        Iterator<String> it = langs.iterator();

        while (it.hasNext()) 
        {
            String lang = it.next();
            if (lang.equals("Python")) 
            {
                it.remove();  // safe way to remove elements while iterating
            }
        }
        System.out.println(langs);


        // Java 5, Enhanced for loop
        // Built on iterator
        // Allows for safety modification of list
        List<String> langs2 = List.of("Java", "Python", "C++");

        for (String lang : langs2) 
        {
            System.out.println(lang);
        }
    }
}
