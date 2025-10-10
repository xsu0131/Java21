package Map;
import java.util.*;
public class TreemapPractice
{
//    public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable

    public static void main(String[] args)
    {
        // Treemap is a map implementation
        // Keeps the keys sorted (natural order or using a Comparator)

        // doesn't allow null keys
//        TreeMap<Integer, String> map = new TreeMap<>();

        // using comparator to sort keys
//        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        // lambda comparator
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
