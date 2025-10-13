package Map;

// basic implementaiton of hash map
// uses generics so you can assign any type to K and V

public class HashMapImplementation<K, V>
{
    private static class Node<K, V>
    {
        K key;
        V value;
        Node <K, V> next;

        Node(K key, V value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int capacity;
    private int size;

    // constructor
    public HashMapImplementation(int capacity)
    {
        this.capacity = capacity;
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    // hashing function

    // getters and setters

    // resize function

}