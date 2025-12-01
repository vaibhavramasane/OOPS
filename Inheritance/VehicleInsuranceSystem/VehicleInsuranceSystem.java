/* Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05


Child classes:
Car → premium increases by 12% if the car has airbags, otherwise 5%
Bike → premium increases by 8% if bike has ABS, otherwise 3%


Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.


Concepts Used
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array


*/
import java.util.*;

class VehicleInsuranceSystem {

    public static void main(String[] args) {

        Scanner xyz = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter details for vehicle " + (i + 1));
            System.out.print("Enter type (car/bike): ");
            String type = xyz.nextLine();

            System.out.print("Enter Brand: ");
            String brand = xyz.nextLine();

            System.out.print("Enter model: ");
            String model = xyz.nextLine();

            System.out.print("Enter base price: ");
            double basePrice = xyz.nextDouble();
            xyz.nextLine(); 

            if (type.equalsIgnoreCase("car")) {
                System.out.print("Does the car have airbags? (true/false): ");
                boolean hasAirbags = xyz.nextBoolean();
                xyz.nextLine();
                vehicles[i] = new Car(brand, model, basePrice, hasAirbags);
            } else if (type.equalsIgnoreCase("bike")) {
                System.out.print("Does the bike have ABS? (true/false): ");
                boolean hasABS = xyz.nextBoolean();
                xyz.nextLine();
                vehicles[i] = new Bike(brand, model, basePrice, hasABS);
            }
        }

        Vehicle highestPremiumVehicle = vehicles[0];
        double highestPremium = highestPremiumVehicle.calculatePremium();

        for (int i = 1; i < vehicles.length; i++) {
            double premium = vehicles[i].calculatePremium();
            if (premium > highestPremium) {
                highestPremium = premium;
                highestPremiumVehicle = vehicles[i];
            }
        }

        System.out.println("\nVehicle with the highest insurance premium:");
        System.out.println("Brand: " + highestPremiumVehicle.brand);
        System.out.println("Model: " + highestPremiumVehicle.model);
        System.out.println("Base Price: " + highestPremiumVehicle.basePrice);
        System.out.println("Premium: " + highestPremium);
    }
}

class Vehicle {

    String brand;
    String model;
    double basePrice;

    Vehicle(String brand, String model, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
    }

    double calculatePremium() {
        return basePrice * 0.05;
    }
}

class Car extends Vehicle {

    boolean hasAirbags;

    Car(String brand, String model, double basePrice, boolean hasAirbags) {
        super(brand, model, basePrice);
        this.hasAirbags = hasAirbags;
    }

    @Override
    double calculatePremium() {
        double premium = super.calculatePremium();
        if (hasAirbags) {
            premium += premium * 0.12;
        } else {
            premium += premium * 0.05;
        }
        return premium;
    }
}

class Bike extends Vehicle {

    boolean hasABS;

    Bike(String brand, String model, double basePrice, boolean hasABS) {
        super(brand, model, basePrice);
        this.hasABS = hasABS;
    }

    @Override
    double calculatePremium() {
        double premium = super.calculatePremium(); // we provide super here because we want to access calculatepremium method from parent
        if (hasABS) {
            premium += premium * 0.08;
        } else {
            premium += premium * 0.03;
        }
        return premium;
    }
}
