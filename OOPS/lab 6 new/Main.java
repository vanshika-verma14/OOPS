final class Logger {
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// Uncommenting the below class will cause a compilation error since Logger is final
// class ExtendedLogger extends Logger {}

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a log message.");
    }
}
