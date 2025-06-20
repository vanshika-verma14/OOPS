// Define a class named 'main2' that extends Thread to represent a custom thread
class main2 extends Thread {

    // Override the run() method that contains the code the thread will execute
    public void run() {
        // Print the name of the thread currently executing this run() method
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }

    // The main() method is the entry point oaf the Java program
    public static void main(String[] args) {
        // Create an instance of main2, which is a thread
        main2 t = new main2();

        System.out.println("Calling run():");
        // Directly calling run() will NOT create a new thread
        // The run() method executes in the main thread like a normal method
        t.run();

        System.out.println("Calling start():");
        // Calling start() creates a new thread and then calls the run() method inside that thread
        t.start();
    }
}


