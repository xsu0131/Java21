package SingletonEnum;

public class Main 
{
    public static void main(String[] args) 
    {
        // access singleton
        // can't create new of product manager because it's an enum
        ProductManager manager = ProductManager.INSTANCE;

        // Set values 
        manager.setProductName("Laptop");
        manager.setProductCount(5);

        // Get values
        System.out.println("Product " + manager.getProductName());
        System.out.println("Count: " + manager.getProductCount());
    }
}
