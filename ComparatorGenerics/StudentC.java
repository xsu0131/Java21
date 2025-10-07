package ComparatorGenerics;

// custom class
public class StudentC 
{
    private int id;
    private String name;

    public StudentC(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public String getName() 
    { 
        return name; 
    }
    public int getId() 
    { 
        return id; 
    }

    @Override
    public String toString() 
    {
        return id + " - " + name;
    }
}
