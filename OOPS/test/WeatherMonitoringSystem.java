import java.util.*;
class WeatherRecord {
    private String date;
    private double temp, humidity, windspd;

    public WeatherRecord(String date, double temp, double hum, double windspeed) {
        this.date = date;
        this.temp = temp;
        this.humidity = hum;
        this.windspd = windspeed;
    }
    public String getDate() {
        return date;
    }
    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindspd() {
        return windspd;
    }

    public void update(double temperature, double humidity, double windSpeed) {
        this.temp = temperature;
        this.humidity = humidity;
        this.windspd = windSpeed;
    }

    public void display() {
        System.out.println("Date: " + date + ", Temperature: " + temp + "°C, Humidity: " + humidity + "%, Wind Speed: " + windspd + " km/h");
    }
}
class Location {
    private String name;
    private double latitude, longitude;
    private WeatherRecord[] records;
    private int recordCount;

    public Location(String name, double latitude, double longitude, int maxRecords) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.records = new WeatherRecord[maxRecords];
        this.recordCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addWeatherRecord(WeatherRecord record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
        } else {
            System.out.println("No more space to store weather records for this location.");
        }
    }

    public void updateWeatherRecord(String date, double temperature, double humidity, double windSpeed) {
        for (int i = 0; i < recordCount; i++) {
            if (records[i].getDate().equals(date)) {
                records[i].update(temperature, humidity, windSpeed);
                return;
            }
        }
        System.out.println("No record found for the given date.");
    }

    public void displayWeatherRecords() {
        if (recordCount == 0) {
            System.out.println("No weather records available.");
        } else {
            for (int i = 0; i < recordCount; i++) {
                records[i].display();
            }
        }
    }
}

// Weather Monitoring System
public class WeatherMonitoringSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Location[] locations = new Location[10];
    private static int locationCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWeather Monitoring System");
            System.out.println("1. Add Location");
            System.out.println("2. Add Weather Record");
            System.out.println("3. Update Weather Record");
            System.out.println("4. View Weather Records");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addLocation();
                    break;
                case 2:
                    addWeatherRecord();
                    break;
                case 3:
                    updateWeatherRecord();
                    break;
                case 4:
                    viewWeatherRecords();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addLocation() {
        if (locationCount < locations.length) {
            System.out.print("Enter location name: ");
            String name = scanner.nextLine();
            System.out.print("Enter latitude: ");
            double latitude = scanner.nextDouble();
            System.out.print("Enter longitude: ");
            double longitude = scanner.nextDouble();
            locations[locationCount++] = new Location(name, latitude, longitude, 10);
        } else {
            System.out.println("No more space to add locations.");
        }
    }

    private static void addWeatherRecord() {
        System.out.print("Enter location name: ");
        String name = scanner.nextLine();
        Location location = findLocation(name);
        if (location == null) {
            System.out.println("Location not found!");
            return;
        }
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter humidity: ");
        double humidity = scanner.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = scanner.nextDouble();
        location.addWeatherRecord(new WeatherRecord(date, temperature, humidity, windSpeed));
    }

    private static void updateWeatherRecord() {
        System.out.print("Enter location name: ");
        String name = scanner.nextLine();
        Location location = findLocation(name);
        if (location == null) {
            System.out.println("Location not found!");
            return;
        }
        System.out.print("Enter date (YYYY-MM-DD) to update: ");
        String date = scanner.nextLine();
        System.out.print("Enter new temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter new humidity: ");
        double humidity = scanner.nextDouble();
        System.out.print("Enter new wind speed: ");
        double windSpeed = scanner.nextDouble();
        location.updateWeatherRecord(date, temperature, humidity, windSpeed);
    }

    private static void viewWeatherRecords() {
        System.out.print("Enter location name: ");
        String name = scanner.nextLine();
        Location location = findLocation(name);
        if (location != null) {
            location.displayWeatherRecords();
        } else {
            System.out.println("Location not found!");
        }
    }

    private static Location findLocation(String name) {
        for (int i = 0; i < locationCount; i++) {
            if (locations[i].getName().equals(name)) {
                return locations[i];
            }
        }
        return null;
    }
}