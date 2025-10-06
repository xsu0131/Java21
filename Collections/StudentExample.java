import java.util.*;

class StudentExample
{
    String name;
    int id;
    double gpa;

    public StudentExample(String name, int id, double gpa) 
    {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() 
    {
        return name + "(" + id + ", " + gpa + ")";
    }

    public static void main(String[] args) 
    {
        List<StudentExample> list = new ArrayList<>(List.of(
            new StudentExample("Charlie", 3, 3.4),
            new StudentExample("Alice", 1, 3.9),
            new StudentExample("Bob", 2, 3.2)
        ));

        // Comparator with Lambda
        // Sort by name (ascending)
        list.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("By name: " + list);

        // Sort by GPA (descending)
        list.sort((s1, s2) -> Double.compare(s2.gpa, s1.gpa));
        System.out.println("By GPA descending: " + list);

        // Sort by ID (ascending)
        Collections.sort(list, (a, b) -> Integer.compare(a.id, b.id));
        System.out.println("By ID: " + list);
    }
}
