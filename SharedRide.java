package week6;

public class SharedRide extends EconomyRide{
    private int passengerCount;
    
    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMin
    ,int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMin);
        setPassengerCount(passengerCount);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if(passengerCount < 1 || passengerCount > 4){
            System.out.println("Warning: Passenger count must be between 1 and 4! Setting to 1");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }
    
    @Override
    public double calculateFare() {
        double perPersonBase = super.calculateFare() / this.passengerCount;
        return perPersonBase * 1.10; 
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Passengers: " + passengerCount + " (Type: Shared)";
    }
}
