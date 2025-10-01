package SealedInterface;

public class Main 
{
    public static void main(String[] args) 
    {
        Shape c = new Circle();
        Shape r = new Rectangle(5, 10);

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle" + r.area());

        
    }
}
