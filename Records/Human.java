public class Human 
{
    String name;
    int number;

    public Human(String name,int number)
    {
        this.name = name;
        this.number = number;
    }


    public static void main(String[] args) 
    {
        Human h1 = new Human("Andrew", 1);
        Human h2 = new Human("Andrew", 1);

        // returns false
        System.out.println(h1.equals(h2));
    }
}
