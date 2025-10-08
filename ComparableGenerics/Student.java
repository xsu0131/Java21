package ComparableGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// The comparable interface is generic

// it tells the compiler that the class with type parameter <T> can compare itself with another object T
// public interface Comparable<T> 
// {
//     int compareTo(T o);
// }

public class Student implements Comparable<Student>
{
    private int id;
    private String name;

    // constructor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // interface must be implemented by class comparing for COMPARABLE
    @Override
    public int compareTo(Student other)
    {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString()
    {
        return id + " - " + name;
    }

    public static void main(String[] args) 
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Alice"));
        list.add(new Student(1, "Bob"));
        list.add(new Student(2, "Charlie"));

        Collections.sort(list); // uses compareTo()
        System.out.println(list);
    }
}
