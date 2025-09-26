package SingletonEnum;

// enum is implicitly final
// you can't call new to create another instance
// JVM ensures only one instance
// You can do new some other class inside the enum to initialize fields when needed

public enum ProductManager
{
    INSTANCE;

    // constructor 
    // public ProductManager()
    // {

    // }

    // Fields for Singleton
    private String productName;
    private int productCount;

    // Another class, not the enum
    private Product product;

    // getters and setters
    public String getProductName() 
    {
        // you can do lazy initialization
        // new is valid here, this is a public class not enum
        if(product == null)
        {
            product = new Product("Default product", 0);
        }
        return productName;
    }
    public int getProductCount() 
    {
        return productCount;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }
    public void setProductCount(int productCount) 
    {
        this.productCount = productCount;
    }
 
}