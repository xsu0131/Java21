package OctoberAssesmentQ1;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

// Matching/Dispatch Service (Pairing one driver to a passanger)
public class DispatchService extends Thread
{
    private final DriverService driverService;
    private final List<Ride> rides;
    private final ReentrantLock lock;
    private final Passenger passenger;

    // constructor, takes in a driver service
    public DispatchService(DriverService driverService, List<Ride> rides, ReentrantLock lock, Passenger passenger)
    {
        this.driverService = driverService;
        this.rides = rides;
        this.lock = lock;
        this.passenger = passenger;
    }

    @Override
    public void run()
    {
        Ride ride = bookRide(passenger);
        if (ride != null)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            completeRide(ride);
        }
    }

    // method to book a ride
    public Ride bookRide(Passenger passenger)
    {
        // aquire lock to prevent two passangers from getting the same driver
        lock.lock();

        try
        {
            // loop through drivers to check to see which driver is available
            for (Driver driver: driverService.getDrivers())
            {
                if (driver.isAvailable())
                {
                    // mark driver to be unavailable
                    driver.setAvailable(false);

                    // Create an object for Ride
                    Ride ride = new Ride(passenger, driver,"Assigned");

                    rides.add(ride);

                    System.out.println(Thread.currentThread().getName() + " booked driver: " + driver.getName() + " for passenger: " + passenger.getName());

                    return ride;
                }
            }

            // else no drivers available
            System.out.println(Thread.currentThread().getName() + " - No available drivers for passenger: " + passenger.getName());
            return null;
        }
        finally
        {
            lock.unlock();
        }
    }

    // method to free driver and complete ride
    public void completeRide(Ride ride)
    {
        lock.lock();
        try
        {
            if (ride != null)
            {
                if (ride.getStatus() == "Assigned")
                {
                    ride.setStatus("Completed");
                    ride.getDriver().setAvailable(true);

                    System.out.println("Ride completed for passenger " + ride.getPassenger().getName() + " with driver " + ride.getDriver().getName());
                }
            }
        }
        finally
        {
            lock.unlock();
        }
    }
}
