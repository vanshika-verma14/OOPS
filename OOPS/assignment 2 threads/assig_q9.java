// Thread class to print odd numbers
class OddThread extends Thread {
    public void run() {
        // Loop to print odd numbers from 1 to 10
        for (int i = 1; i <= 10; i += 2) {
            // Print current odd number
            System.out.println("Odd Thread: " + i);
            try {
                // Pause for 0.5 seconds to simulate delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle any interruption
                System.out.println(e);
            }
        }
    }
}

// Thread class to print even numbers
class EvenThread extends Thread {
    public void run() {
        // Loop to print even numbers from 2 to 10
        for (int i = 2; i <= 10; i += 2) {
            // Print current even number
            System.out.println("Even Thread: " + i);
            try {
                // Pause for 0.5 seconds to simulate delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle any interruption
                System.out.println(e);
            }
        }
    }
}

// Main class to execute the threads
public class assig_q9 {
    public static void main(String[] args) {
        // Create an instance of OddThread
        OddThread oddThread = new OddThread();

        // Create an instance of EvenThread
        EvenThread evenThread = new EvenThread();

        // Start the thread that prints odd numbers
        oddThread.start();

        // Start the thread that prints even numbers
        evenThread.start();
    }
}
