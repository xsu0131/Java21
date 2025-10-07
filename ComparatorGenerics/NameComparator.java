package ComparatorGenerics;

import java.util.Comparator;

// A Comparator<T> is a functional interface in java.util 
// used to define a custom sorting order for objects of type T

// Before Java 5, it used to compare raw types
// Drawbacks: If you accidentally compared unrelated types (like Student vs Teacher), 
// the compiler allowed it — and it failed at runtime with ClassCastException.

// public static <T extends Comparable<? super T>> void sort(List<T> list)

public class NameComparator implements Comparator<StudentC> 
{
    // The compiler replaces T with studentC and enforces type safety
    @Override
    public int compare(StudentC s1, StudentC s2) 
    {
        // uses getters and setters
        return s1.getName().compareTo(s2.getName());
    }
}

// Generics for Comparator
// -> Type-safe
// -> Errors found at compile-time
// -> Easy to read and refactor
// -> IDE auto-completion and type inference