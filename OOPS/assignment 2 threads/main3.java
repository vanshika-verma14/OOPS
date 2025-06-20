// Define a class named 'main3' that extends the Thread class
// This class represents a thread that will print even numbers
class main3 extends Thread {

    // Override the run() method which will execute when the thread starts
    public void run() {
        // Loop through even numbers from 2 to 10 (inclusive)
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i); // Print the current even number

            try {
                Thread.sleep(500); // Pause for 500 milliseconds (half a second)
            } catch (InterruptedException e) {
                // If the thread is interrupted during sleep, print the exception
                System.out.println(e);
            }
        }
    }

    // Main method — the entry point of the Java program
    public static void main(String[] args) {
        // Create an instance of the 'main3' thread class
        main3 t = new main3();

        // Start the thread by calling start()
        // This invokes the run() method in a new thread
        t.start();
    }
}
