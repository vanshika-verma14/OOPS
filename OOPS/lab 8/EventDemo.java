// 3.	Create an interface EventHandler with a method handleEvent(). In the main method, demonstrate the use of:
// a.	A local inner class inside a method registerEvent() that implements EventHandler and prints "Event handled by local inner class".
// b.	An anonymous inner class that implements EventHandler and prints "Event handled by anonymous inner class".

interface EventHandler {
    void handleEvent();
}

public class EventDemo {

    void reg() {
        class L implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        EventHandler e = new L();
        e.handleEvent();
    }

    public static void main(String[] args) {
        EventDemo d = new EventDemo();
        d.reg();

        EventHandler e = new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        e.handleEvent();
    }
}

