// Q5: Difference between extending Thread and implementing Runnable
// File/class name: main5

// --- First Example: Extending the Thread class ---
class ThreadExample extends Thread { // Inherits from Thread class
    public void run() {
        // This run() method defines what the thread will do
        System.out.println("ThreadExample: Running using Thread class");
    }
}

// --- Second Example: Implementing the Runnable interface ---
class RunnableExample implements Runnable { // Implements Runnable interface
    public void run() {
        // This run() method defines what the thread will do
        System.out.println("RunnableExample: Running using Runnable interface");
    }
}

// Main class to run both examples
public class main5 {
    public static void main(String[] args) {

        // --- Using Thread by extending the Thread class ---
        ThreadExample t1 = new ThreadExample(); // Create thread instance
        t1.start(); // Start the thread, which calls run() internally

        // --- Using Thread by implementing the Runnable interface ---
        RunnableExample r1 = new RunnableExample(); // Create Runnable object
        Thread t2 = new Thread(r1); // Wrap Runnable in a Thread
        t2.start(); // Start the thread, which calls run() internally
    }
}

