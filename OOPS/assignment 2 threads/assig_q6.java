class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread 1 is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class assig_q6 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();  // Create Runnable object
        Thread t1 = new Thread(r1);  // Create Thread and pass Runnable instance
        
        System.out.println("Thread state before start: " + t1.getState());
        t1.start();
        System.out.println("Thread state after start: " + t1.getState());
    }
}