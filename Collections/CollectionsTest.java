package Collections;

// Helper class with static methods

// Collection is a group of objects (called elements) stored and managed together

import java.util.*;

// Helper class with static methods
// import java.util.Collections;

// Iterable (interface)
//        |
//        |
//  ________________________________
//. |                              |
//. Collection          Map<K, V> (Not a subtype of collection)
// List, Set, Queue


// List: ArrayList, LinkedList, Vector, Stack
// Set: HashSet, LinkedHashSet, TreeSet
// Queue: LinkedList, PriorityQueue, ArrayDeque
// Deque: ArrayDeque, LinkedList
// Map: HashMap, LinkedHashMap, TreeMap, HashTable

public class CollectionsTest 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(1)); 

        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        System.out.println(nums);

        Queue<String> q = new LinkedList<>();
        q.add("A");
        q.add("B");
        System.out.println(q.remove());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        System.out.println(dq);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println(map.get("B"));
        
        List<Integer> list2 = Arrays.asList(3,1,2);
        Collections.sort(list2);
        Collections.reverse(list2);
        Collections.max(list2);
        Collections.min(list2);
        Collections.shuffle(list2);

    }

}
