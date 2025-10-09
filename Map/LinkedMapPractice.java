package Map;

import java.util.*;

public class LinkedMapPractice
{
    public static void main(String[] args)
    {
        // LinkedHashMap preserves insertion order
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println("LinkedHashMap (Insertion Order):");
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
