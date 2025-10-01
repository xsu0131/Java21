package SealedClass;

public sealed class Vehicle permits Honda,Toyota,Lexus
{
    public void start()
    {
        System.out.println(" Vehicle starting ... ");
    }
}
