import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected int mileage;

    public Vehicle(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void updateMileage(int newMileage) {
        this.mileage = newMileage;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Mileage: " + mileage);
    }
}
class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String make, String model, int year, int mileage, int seatingCapacity) {
        super(make, model, year, mileage);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String make, String model, int year, int mileage, int loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class FleetManager {
    private List<Vehicle> fleet;

    public FleetManager() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    public void updateMileage(String make, String model, int newMileage) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.make.equalsIgnoreCase(make) && vehicle.model.equalsIgnoreCase(model)) {
                vehicle.updateMileage(newMileage);
                System.out.println("Mileage updated successfully!");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void displayAllVehicles() {
        if (fleet.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
            return;
        }
        for (Vehicle vehicle : fleet) {
            vehicle.displayInfo();
            System.out.println("----------------------");
        }
    }
}

public class VehicleManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FleetManager fleetManager = new FleetManager();

        while (true) {
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add Car");
            System.out.println("2. Add Truck");
            System.out.println("3. Update Vehicle Mileage");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Make: ");
                    String carMake = scanner.next();
                    System.out.print("Enter Model: ");
                    String carModel = scanner.next();
                    System.out.print("Enter Year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("Enter Mileage: ");
                    int carMileage = scanner.nextInt();
                    System.out.print("Enter Seating Capacity: ");
                    int seatingCapacity = scanner.nextInt();
                    fleetManager.addVehicle(new Car(carMake, carModel, carYear, carMileage, seatingCapacity));
                    break;

                case 2:
                    System.out.print("Enter Make: ");
                    String truckMake = scanner.next();
                    System.out.print("Enter Model: ");
                    String truckModel = scanner.next();
                    System.out.print("Enter Year: ");
                    int truckYear = scanner.nextInt();
                    System.out.print("Enter Mileage: ");
                    int truckMileage = scanner.nextInt();
                    System.out.print("Enter Load Capacity (tons): ");
                    int loadCapacity = scanner.nextInt();
                    fleetManager.addVehicle(new Truck(truckMake, truckModel, truckYear, truckMileage, loadCapacity));
                    break;

                case 3:
                    System.out.print("Enter Make: ");
                    String updateMake = scanner.next();
                    System.out.print("Enter Model: ");
                    String updateModel = scanner.next();
                    System.out.print("Enter New Mileage: ");
                    int newMileage = scanner.nextInt();
                    fleetManager.updateMileage(updateMake, updateModel, newMileage);
                    break;

                case 4:
                    fleetManager.displayAllVehicles();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
