/// What happens if you call run() instead of start()? Demonstrate with a program.

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class assig_q8 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Calling run():");
        t1.run();  // Runs in the main thread
        t2.run();  // Runs in the main thread

        System.out.println("\nCalling start():");
        t1.start();  // Runs in a separate thread
        t2.start();  // Runs in a separate thread
    }
}