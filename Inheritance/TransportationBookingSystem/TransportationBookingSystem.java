/*Q5. Transportation Booking System – Fare Calculation
Parent class: Transport
Fields: distance, baseFare
Child classes:
Bus


Fare = baseFare + (distance × 5)
If AC = true → add 20%
Train


Fare = baseFare + (distance × 4)
If sleeper → add 15%
Flight

Fare = baseFare + (distance × 10)
Add airport tax = ₹750
If businessClass → add 40%



Task:
Create 10 bookings.
Calculate final fare via overriding.


Print:
Total revenue

Bookings where fare > 20,000
Count bookings of each type
 */
class Transport {
    double distance;
    double baseFare;

    Transport(double distance, double baseFare) {
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return baseFare + (distance * 0); // Placeholder for child class to override
    }
}

class Bus extends Transport {
    boolean AC;

    Bus(double distance, double baseFare, boolean AC) {
        super(distance, baseFare);
        this.AC = AC;
    }

    @Override
    public double calculateFare() {
        double fare = baseFare + (distance * 5);
        if (AC) {
            fare += fare * 0.20; // Adding 20% for AC
        }
        return fare;
    }
}

class Train extends Transport {
    boolean sleeper;

    Train(double distance, double baseFare, boolean sleeper) {
        super(distance, baseFare);
        this.sleeper = sleeper;
    }

    @Override
    public double calculateFare() {
        double fare = baseFare + (distance * 4);
        if (sleeper) {
            fare += fare * 0.15; // Adding 15% for sleeper
        }
        return fare;
    }
}

class Flight extends Transport {
    boolean businessClass;

    Flight(double distance, double baseFare, boolean businessClass) {
        super(distance, baseFare);
        this.businessClass = businessClass;
    }

    @Override
    public double calculateFare() {
        double fare = baseFare + (distance * 10) + 750; // Adding ₹750 for airport tax
        if (businessClass) {
            fare += fare * 0.40; // Adding 40% for business class
        }
        return fare;
    }
}

public class TransportationBookingSystem {
    public static void main(String[] args) {
        // Creating 10 bookings
        Transport[] bookings = new Transport[]{
            new Bus(100, 500, true),          // Bus with AC
            new Bus(200, 400, false),         // Bus without AC
            new Train(300, 600, true),        // Train with sleeper
            new Train(400, 450, false),       // Train without sleeper
            new Flight(500, 1000, true),      // Flight with business class
            new Flight(600, 1200, false),     // Flight without business class
            new Bus(150, 450, true),          // Bus with AC
            new Train(200, 500, true),        // Train with sleeper
            new Flight(700, 1500, true),      // Flight with business class
            new Bus(120, 550, false)          // Bus without AC
        };

        double totalRevenue = 0;
        int busCount = 0, trainCount = 0, flightCount = 0;
        int highFareCount = 0;

        for (Transport booking : bookings) {
            double fare = booking.calculateFare();
            totalRevenue += fare;

            // Count each type of transport
            if (booking instanceof Bus) busCount++;
            if (booking instanceof Train) trainCount++;
            if (booking instanceof Flight) flightCount++;

            // Check if fare is greater than ₹20,000
            if (fare > 20000) {
                highFareCount++;
            }
        }

        // Output results
        System.out.println("Total Revenue: " + totalRevenue);
        System.out.println("Bookings where fare > 20,000: " + highFareCount);
        System.out.println("Bus Bookings: " + busCount);
        System.out.println("Train Bookings: " + trainCount);
        System.out.println("Flight Bookings: " + flightCount);
    }
}
