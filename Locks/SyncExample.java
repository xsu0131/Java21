package Locks;

public class SyncExample extends Thread
{
    private int counter = 0;
    private String action;
    public SyncExample(String action)
    {
        this.action = action;
    }
    // synchronized method
    public synchronized void increment()
    {
        counter++;
    }

    // synchronized block
    public void decrement()
    {
        // lock on current instance
        synchronized (this)
        {
            counter--;
        }
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            if (action.equals("inc"))
            {
                increment();
            }
            else
            {
                decrement();
            }
        }
    }
    public static void main(String[] args) {
        SyncExample t1 = new SyncExample("inc");
        SyncExample t2 = new SyncExample("dec");

        t1.start();
        t2.start();
    }
}
