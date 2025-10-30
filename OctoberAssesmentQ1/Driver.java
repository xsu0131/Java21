package OctoberAssesmentQ1;

public class Driver
{
    private String driverId;
    private String name;
    private String phoneNumber;
    private String licensePlate;
    private boolean isAvailable; // driver is considered unavailable once they accept a ride

    public Driver(String driverId, String name, String phoneNumber, String licensePlate)
    {
        this.driverId = driverId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.licensePlate = licensePlate;
        this.isAvailable = true;
    }

    // getters
    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public String getDriverPhoneNumber() {
        return phoneNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString()
    {
        return "Driver{" + "driverId='" + driverId + " " + ", name='" + name + ", " + ", vehicleNumber='" + licensePlate + ", " + ", available=" + isAvailable + '}';
    }
}


