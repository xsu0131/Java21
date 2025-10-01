package SealedInterface;

public class Main 
{
    public static void main(String[] args) 
    {
        Shape c = new Circle();
        Shape r = new Rectangle(5, 10);
        Shape s = new Square(6);
        Shape t = new Triangle(4, 7);


        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Square area: " + s.area());
        System.out.println("Triangle area: " + t.area());

        printShape(c);
        printShape(r);
        printShape(t);
    }

    // pattern matching switch
    static void printShape(Shape shape) 
    {
        String desc = switch (shape) 
        {
            case Circle c -> "Circle area: " + c.area();
            case Rectangle r -> "Rectangle area: " + r.area(); 
            case Triangle t -> "Triangle area: " + t.area();
        };
    }
}
