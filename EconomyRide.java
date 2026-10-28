package week6;

public class EconomyRide extends Ride{
    private double pricePerMin;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMin) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        setPricePerMin(pricePerMin);
    }

    public double getPricePerMin() {
        return pricePerMin;
    }

    public void setPricePerMin(double pricePerMin) {
        if(pricePerMin <= 0){
            System.out.println("Warning: Price per minute must be positive! Setting to 1.0");
            this.pricePerMin = 1.0;
        } else {
            this.pricePerMin = pricePerMin;
        }
    }
    
    @Override
    public double calculateFare(){
        double totalFare = super.calculateFare() + (getDurationMin() * this.pricePerMin);
        if(totalFare < 50.0){
            return 50.0;
        }
        return totalFare;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Price/Min: " + pricePerMin + " TL (Type: Economy)";
    }
}
