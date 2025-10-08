package Array;

public class DynamicIntArray 
{
    private int[] data;    
    private int size;      

    public DynamicIntArray() 
    {
        // initial capacity
        data = new int[5];  
        size = 0;
    }

    public void add(int value) 
    {
        if (size == data.length) 
        {
            // make room
            resize(); 
        }
        data[size++] = value;
    }

    private void resize() 
    {

        // double capacity
        int newCapacity = data.length * 2;  
        int[] newData = new int[newCapacity];

        // manually copy elements
        for (int i = 0; i < data.length; i++) 
        {
            newData[i] = data[i];
        }

        // switch to new array
        data = newData; 
    }

    public int get(int index) 
    {
        if (index < 0 || index >= size) 
        {
            System.out.println("Invalid Index: " + index);
        }

        return data[index];
    }

    public int size() 
    {
        return size;
    }

    public void display() 
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        DynamicIntArray arr = new DynamicIntArray();

        for (int i = 1; i <= 12; i++) 
        {
            arr.add(i);
            arr.display();
        }
    }
}
