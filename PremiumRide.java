package week6;

public class PremiumRide extends Ride{
    private double comfortFee;
    private double surgeMultiplier;
    
    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm,
            double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        setComfortFee(comfortFee);
        setSurgeMultiplier(surgeMultiplier);
    }

    public double getComfortFee() {
        return comfortFee;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public void setComfortFee(double comfortFee) {
        if(comfortFee < 0){
            System.out.println("Warning: Comfort fee cannot be negative! Setting to 0.0");
            this.comfortFee = 0.0;
        } else {
            this.comfortFee = comfortFee;
        }
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        if(surgeMultiplier < 1.0 || surgeMultiplier > 3.0){
            System.out.println("Warning: Surge multiplier must be between 1.0 and 3.0! Setting to 1.0");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }
    
    @Override
    public double calculateFare() {
        return (super.calculateFare() + this.comfortFee) * this.surgeMultiplier;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Comfort Fee: " + comfortFee + " TL, Surge: " + surgeMultiplier + "x (Type: Premium)";
    }
}
