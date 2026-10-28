package week6;

import java.util.ArrayList;
import java.util.List;

public class Week6 {

    public static void main(String[] args) {
    
        List<Ride> rides = new ArrayList<>();

        Ride r1 = new EconomyRide("Yeter", "Uni", "Home", 10.0, 15, 12.0, 3.0);
        Ride r2 = new EconomyRide("Esra", "Uni", "Kayseri Park", 2.0, 5, 8.0, 1.0); 
        Ride r3 = new PremiumRide("Yeter", "Uni", "Home", 60.0, 30,20.0 ,50.0, 1.5);
        Ride r4 = new SharedRide("Mehmet", "Talas", "Meydan", 12.0, 20, 10.0, 2.0, 5);

        rides.add(r1);
        rides.add(r2);
        rides.add(r3);
        rides.add(r4);
        
        for(Ride ride: rides){
            System.out.println(ride.toString());
            System.out.printf("Calculated Fare: %.2f TL\n", ride.calculateFare());
            System.out.println("---------------------------------------------------");
        }
    }
    
}
