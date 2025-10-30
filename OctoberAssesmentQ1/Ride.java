package OctoberAssesmentQ1;

public class Ride
{
    private Passenger passenger;
    private Driver driver;
    private String status; // Requested the ride, Assigned ride, Completed the ride

    public Ride(Passenger passenger, Driver driver, String status)
    {
        this.passenger = passenger;
        this.driver = driver;
        this.status = "Unassigned";
    }

    // setters
    public Passenger getPassenger() {
        return passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
