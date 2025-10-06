package Collections;

import java.util.*;

public class MainTwo 
{
    public static void main(String[] args) 
    {
        List<StudentTwo> list = new ArrayList<>();

        list.add(new StudentTwo(3, "Alice"));
        list.add(new StudentTwo(1, "Bob"));
        list.add(new StudentTwo(2, "Charlie"));

        // Sort using natural order (compareTo)
        Collections.sort(list);

        System.out.println("Sorted by ID: " + list);
    }
}
