
// record
// Immutable Data Holders
// record gives you: constructor + getters + equals + hashCode + toString manually
// 
public record Person(String name, int number) 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);

        // returns true
        System.out.println(p1.equals(p2));
    }
    
}
