package Collections;

public class StudentTwo implements Comparable<StudentTwo> 
{
    public int id;
    public String name;

    public StudentTwo(int id, String name) 
    {   
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(StudentTwo other) 
    {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() 
    {
        return id + " - " + name;
    }
}


