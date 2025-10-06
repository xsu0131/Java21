package Collections;

public interface Comparator<Student>
{
    // Comparable and Comparator is used to compare objects in Java

    // Comparable: java.lang
    // int compareTo(T o)

    // Comparator: java.util
    // int compare(T o1, T o2)

    public int compare(Student s1, Student s2);
    
}