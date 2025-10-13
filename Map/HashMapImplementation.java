package Map;

// basic implementaiton of hash map
// uses generics so you can assign any type to K and V

// Interface for Map (contract or blueprint that defines what HashMap must implement)
interface SimpleMap<K, V>
{
    // Entry<K,V>
    V put(K key, V value);
    V get(Object key);
    V remove(Object key);
    boolean containsKey(Object key);
    int size();
    boolean isEmpty();
    void clear();
}

public class HashMapImplementation<K, V> implements SimpleMap<K, V>
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

    // power of two
    protected static final int DEFAULT_INITIAL_CAPACITY = 16;

    // load factor
    protected static final float DEFAULT_LOAD_FACTOR = 0.75f;

    // max capacity
    protected static final int MAX_CAPACITY = 1 << 30;

    // Node[] buckets or Hash table that contains arrays of Node<K, V>
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
    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    // resize function

}