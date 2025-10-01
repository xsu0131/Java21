package SealedInterface;

public sealed interface Shape permits Rectangle, Triangle, Circle
{
    double area();
}


// SUBCLASSES

// final subclass (can't extend anymore)
final class Circle implements Shape
{
    private static final double radius = 8;

    @Override
    public double area() 
    {
        return 3.1416 * radius * radius;
    }
}

// Sealed subclass (can add more restrictions)
sealed class Rectangle implements Shape permits Square
{
    private final double width;
    private final double height;

    // constructor
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area()
    {
        return width*height;
    }
}

// Only square can extend Rectangle
final class Square extends Rectangle
{
    public Square(double side)
    {
        super(side, side);
    }
}

non-sealed class Triangle implements Shape
{
    private final double base, height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override 
    public double area()
    {
        return 0.5 * height * base;
    }
}