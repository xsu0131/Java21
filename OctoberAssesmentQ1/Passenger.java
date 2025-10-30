package OctoberAssesmentQ1;

public class Passenger {
    private String passengerId;
    private String name;
    private String phoneNumber;
    private String pickupLocation;
    private String dropoffLocation;

    public Passenger(String passengerId, String name, String phoneNumber, String pickupLocation, String dropoffLocation) {
        this.passengerId = passengerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
    }

    // getters
    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getPassengerPhoneNumber() {
        return phoneNumber;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    @Override
    public String toString() {
        return "Passenger{" + "passengerId='" + passengerId + ", " +
                ", name='" + name + ", " +
                ", pickupLocation='" + pickupLocation + ", " +
                ", dropoffLocation='" + dropoffLocation + ", " +
                '}';
    }
}
