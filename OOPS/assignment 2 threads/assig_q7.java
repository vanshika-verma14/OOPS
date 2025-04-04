// Create two threads using classes ThreadA and ThreadB. Each should print a custom message.

// ThreadA extends Thread
class ThreadA extends Thread {
    public void run() {
        System.out.println("ThreadA: Hello from Thread A!");
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
    }
}

// ThreadB extends Thread
class ThreadB extends Thread {
    public void run() {
        System.out.println("ThreadB: Greetings from Thread B!");
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
    }
}

public class assig_q7 {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();  // Start ThreadA
        t2.start();  // Start ThreadB
    }
}