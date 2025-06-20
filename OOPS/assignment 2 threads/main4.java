// Define a class named 'main4' that implements the Runnable interface
// Runnable is used to define a task that can be run by a thread
class main4 implements Runnable {

    // Implement the run() method which contains the task for the thread
    public void run() {
        // Loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // Print the current number

            try {
                Thread.sleep(500); // Pause for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                // Handle if the thread is interrupted while sleeping
                System.out.println(e);
            }
        }
    }

    // The main() method is the entry point of the Java program
    public static void main(String[] args) {
        // Create an instance of the class that implements Runnable
        main4 task = new main4();

        // Wrap the Runnable instance in a Thread object
        Thread thread = new Thread(task);

        // Start the thread — this internally calls the run() method in a new thread
        thread.start();
    }
}
