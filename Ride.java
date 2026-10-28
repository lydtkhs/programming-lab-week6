package week6;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        setDistanceKm(distanceKm);
        setDurationMin(durationMin);
        setPricePerKm(pricePerKm);
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setDistanceKm(double distanceKm) {
        if(distanceKm <= 0){
            System.out.println("Warning: Distance must be positive! Setting to 1.0");
            this.distanceKm = 1.0; 
        } else {
            this.distanceKm = distanceKm;
        }
    }

    public void setDurationMin(int durationMin) {
        if(durationMin <= 0){
            System.out.println("Warning: Duration must be positive! Setting to 1");
            this.durationMin = 1;
        } else {
            this.durationMin = durationMin;
        }
    }

    public void setPricePerKm(double pricePerKm) {
        if(pricePerKm <= 0){
            System.out.println("Warning: Price per km must be positive! Setting to 1.0");
            this.pricePerKm = 1.0;
        } else {
            this.pricePerKm = pricePerKm;
        }
    }

    public double calculateFare(){
        return this.distanceKm * this.pricePerKm;
    }
    
    @Override
    public String toString(){
        return "Passenger: " + passengerName + ", Pickup: " + pickup + ", Destination: " + destination +
               ", Distance: " + distanceKm + " km, Duration: " + durationMin + " mins, Price/Km: " + pricePerKm + " TL";
    }
}
