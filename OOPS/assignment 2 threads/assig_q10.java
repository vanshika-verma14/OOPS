// Create three threads using Runnable, each printing a different message 5 times.

class ThreadA implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadA: This is message " + i);
            try {
                Thread.sleep(500);  // Simulate delay of 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadB: This is message " + i);
            try {
                Thread.sleep(500);  // Simulate delay of 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadC implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadC: This is message " + i);
            try {
                Thread.sleep(500);  // Simulate delay of 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class assig_q10 {
    public static void main(String[] args) {
        // Create Runnable instances
        Runnable r1 = new ThreadA();
        Runnable r2 = new ThreadB();
        Runnable r3 = new ThreadC();

        // Create threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}