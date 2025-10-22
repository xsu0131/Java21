package Locks;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample extends Thread
{
    // shared variable
    private static int counter = 0;
    private static final ReentrantLock lock = new ReentrantLock(); // shared lock
    private String action; // "inc" or "dec"

    public ReentrantLockExample(String action)
    {
        this.action = action;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i ++)
        {
            // aquire lock before accessing shared data
            if (lock.tryLock())
            {
                try{
                    if (action.equals("inc"))
                    {
                        counter++;
                    }
                    else
                    {
                        counter--;
                    }
                }
                finally {
                    lock.unlock();
                }
            }
            else
            {
                System.out.println(Thread.currentThread().getName() + "couldn't get the lock");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Reentrant lock allows for same thread to acquire the same lock multiple times without getting stuck
        // Re-enter a section of a code that's already locked

        // ReentrantLock keeps track of:
        // Which thread currently owns the lock.
        // How many times that thread has acquired it.
        
        ReentrantLockExample t1 = new ReentrantLockExample("inc");
        t1.setName("Incrementer");
        ReentrantLockExample t2 = new ReentrantLockExample("dec");
        t2.setName("Decrementer");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter:"  + counter);
    }
}
