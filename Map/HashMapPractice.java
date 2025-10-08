package Map;

import java.util.*;

public class HashMapPractice 
{
    // HashMap has static nested classes
    // static nested classes help multiple Node<K, V> objects 
    // for different HashMap<K,V> instances without extra references

    // it avoids requiring to allocate new memory and using the new keyword
    // Every time we use new, it creates a reference for an object

    public static void main(String[] args) 
    {
        Map<Integer,Character> map = new HashMap<>(); 

        map.put(0, 'a');
        map.put(0, 'b');
        map.putIfAbsent(1, 'c');
        map.putIfAbsent(2, 'c');


        System.out.println(map.toString());

        // iteration using .forEach
        map.forEach((key, value) -> System.out.println(key + " = " + value));

    }
}
