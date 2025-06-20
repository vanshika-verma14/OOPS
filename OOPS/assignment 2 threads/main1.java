class main1 extends Thread {
    // Override the run() method which defines the task to be executed by the thread.
    public void run() {
        // A for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // Print the current value of i
            try {
                Thread.sleep(500); // Pause the thread for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                // This block is executed if the thread is interrupted while sleeping
                System.out.println(e); // Print the exception message
            } }
    }
    // The main() method is the entry point of any Java program
    public static void main(String[] args) {
        // Create an instance of the class 'main1', which is also a Thread
        main1 t = new main1();
        // Start the thread by calling start(), which internally calls the run() method
        t.start();
    }
}
