package Threads;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class CounterThreadsLocks
{
    public static void main(String[] args)
    {
        final int NUM_THREADS = 3;
        final int MAX = 10;

        numCounter counter = new numCounter(NUM_THREADS, MAX);

        Worker t1 = new Worker("Thread-1", 1, counter);
        Worker t2 = new Worker("Thread-2", 2, counter);
        Worker t3 = new Worker("Thread-3", 3, counter);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Worker extends Thread
{
    private final String name;
    private final int id;
    private final numCounter counter;

    Worker(String name, int id, numCounter counter)
    {
        this.name = name;
        this.id = id;
        this.counter = counter;
    }

    @Override
    public void run()
    {
        while (counter.incrementInOrder(name, id))
        {
            try { Thread.sleep(30); } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

class numCounter
{
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition nextThread = lock.newCondition();

    private final int numThreads;
    private final int max;
    private int count = 0;
    private int turn = 1;

     numCounter(int numThreads, int max)
     {
        this.numThreads = numThreads;
        this.max = max;
     }

     public boolean incrementInOrder(String name, int myId)
     {
         lock.lock();
         try
         {
             // if done, wake other threads to exit
             if (count >= max)
             {
                 nextThread.signalAll();
                 return false;
             }

             // thread wait for turn
             while(turn != myId && count < max)
             {
                 try
                 {
                     nextThread.await();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }

             // safety check: if count >= max
             if (count >= max)
             {
                 nextThread.signalAll();
                 return false;
             }

             // if it's the threads turn
             count++;
             System.out.println(name + " count:" + count);

             // next turn for next thread
             turn = (turn % numThreads) + 1;

             nextThread.signal();

             return count < max;
         }
         finally {
             lock.unlock();
         }
     }

    public int getCount()
    {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }
}
