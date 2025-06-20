class vehicle {
    String brand;
    String model;
    double price;

    vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

class Car extends vehicle {
    int seatingCapacity;
    String fuelType;

    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class eleccar extends Car {
    double batteryCapacity;
    double chargingTime;

    eleccar(String brand, String model, double price, int seatingCapacity, double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

class Motorcycle extends vehicle {
    double engineCapacity;
    String type;

    Motorcycle(String brand, String model, double price, double engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

public class Vehicletest {
    public static void main(String[] args) {
        vehicle v1 = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        vehicle v2 = new eleccar("Tesla", "Model S", 80000, 5, 100, 1.5);
        vehicle v3 = new Motorcycle("Yamaha", "MT-07", 7500, 689, "Sport");

        v1.display();
        System.out.println();
        v2.display();
        System.out.println();
        v3.display();
    }
}
