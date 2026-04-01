import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

// Mock Inventory with Thread-Safe counts
class ConcurrentInventory {
    AtomicInteger single = new AtomicInteger(5);
    AtomicInteger doubleR = new AtomicInteger(3);
    AtomicInteger suite = new AtomicInteger(2);
}

class ConcurrentBookingProcessor implements Runnable {
    private String guest;
    private String type;
    private ConcurrentInventory inventory;

    public ConcurrentBookingProcessor(String guest, String type, ConcurrentInventory inventory) {
        this.guest = guest;
        this.type = type;
        this.inventory = inventory;
    }

    @Override
    public void run() {
        int remaining = 0;
        String id = "";
        if (type.equals("Single")) {
            remaining = inventory.single.decrementAndGet();
            id = "Single-" + (5 - remaining);
        } else if (type.equals("Double")) {
            remaining = inventory.doubleR.decrementAndGet();
            id = "Double-" + (3 - remaining);
        } else if (type.equals("Suite")) {
            remaining = inventory.suite.decrementAndGet();
            id = "Suite-" + (2 - remaining);
        }
        System.out.println("Booking confirmed for Guest: " + guest + ", Room ID: " + id);
    }
}

public class UseCase11ConcurrentBookingSimulation {
    public static void main(String[] args) {
        System.out.println("Concurrent Booking Simulation");
        ConcurrentInventory inventory = new ConcurrentInventory();

        // Create booking processor tasks (Threads)
        Thread t1 = new Thread(new ConcurrentBookingProcessor("Abhi", "Single", inventory));
        Thread t2 = new Thread(new ConcurrentBookingProcessor("Vanmathi", "Double", inventory));
        Thread t3 = new Thread(new ConcurrentBookingProcessor("Kural", "Suite", inventory));
        Thread t4 = new Thread(new ConcurrentBookingProcessor("Subha", "Single", inventory));

        // Start concurrent processing
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            // Wait for threads to finish
            t1.join(); t2.join(); t3.join(); t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread execution interrupted.");
        }

        System.out.println("\nRemaining Inventory:");
        System.out.println("Single: " + inventory.single.get());
        System.out.println("Double: " + inventory.doubleR.get());
        System.out.println("Suite: " + inventory.suite.get());
    }
}