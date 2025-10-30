package OctoberAssesmentQ1;

import java.util.ArrayList;
import java.util.List;

// Driver Service
public class DriverService
{
    // list of Driver objects
    private final List<Driver> drivers = new ArrayList<>();

    // setters and getters
    public void registerDriver(Driver driver)
    {
        // add the driver into the List of drivers
        drivers.add(driver);
        System.out.println("Driver registered: " + driver.getName());
    }

    public List<Driver> getDrivers()
    {
        return drivers;
    }

}
