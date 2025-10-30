package OctoberAssesmentQ1;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
public class RidingSystem
{
    public static void main(String[] args) {
        // initialize driver service
        DriverService driverService = new DriverService();

        // add drivers into driverService
        driverService.registerDriver(new Driver("DV19750", "Alice", "415-1234", "ABC123"));
        driverService.registerDriver(new Driver("DV19750", "Bob", "565-0901", "XYZ789"));

        // shared resources between threads
        List<Ride> rides = new ArrayList<>();
        ReentrantLock lock = new ReentrantLock();

        // create passenger objects
        Passenger p1 = new Passenger("P1", "Charlie", "916-0921", "Downtown", "Airport");
        Passenger p2 = new Passenger("P2", "David", "777-081", "Mall", "Station");
        Passenger p3 = new Passenger("P3", "Eve", "510-0003", "Library", "Hotel");

        // create 3 dispatch services
        DispatchService t1 = new DispatchService(driverService, rides, lock, p1);
        DispatchService t2 = new DispatchService(driverService, rides, lock, p2);
        DispatchService t3 = new DispatchService(driverService, rides, lock, p3);

        // start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
