import java.util.LinkedList;
import java.util.Queue;

// Helper class to store Reservation details
class Reservation {
    String guestName;
    String roomType;

    Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
}

// Helper class to manage the Queue logic
class BookingRequestQueue {
    private Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation res) {
        queue.add(res);
    }

    public boolean hasPendingRequests() {
        return !queue.isEmpty();
    }

    public Reservation processNext() {
        return queue.poll();
    }
}

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        // Display application header
        System.out.println("Booking Request Queue");

        // Initialize booking queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create booking requests
        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        // Add requests to the queue
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Display queued booking requests in FIFO order
        while (bookingQueue.hasPendingRequests()) {
            Reservation current = bookingQueue.processNext();
            System.out.println("Processing booking for Guest: " + current.guestName + 
                               ", Room Type: " + current.roomType);
        }
    }
}