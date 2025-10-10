package Map;

import java.util.*;

public class LinkedHashmapPractice
{
    public static void main(String[] args)
    {
        // LinkedHashMap preserves insertion order
        Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // access some elements
        // Access key 1 -> moves to end
        map.get(1);

        // Access key 2 -> moves to end
        map.get(2);

        System.out.println("LinkedHashMap (Insertion Order):");
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
