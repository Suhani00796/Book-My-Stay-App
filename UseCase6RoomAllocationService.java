import java.util.LinkedList;
import java.util.Queue;

class AllocationRequest {
    String guestName;
    String roomType;
    String roomID;

    AllocationRequest(String guestName, String roomType, String roomID) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.roomID = roomID;
    }
}

public class UseCase6RoomAllocationService {
    public static void main(String[] args) {
        // Display application header
        System.out.println("Room Allocation Processing");

        // Initialize the allocation queue (FIFO)
        Queue<AllocationRequest> allocationQueue = new LinkedList<>();

        // Adding requests to the allocation service
        allocationQueue.add(new AllocationRequest("Abhi", "Single", "Single-1"));
        allocationQueue.add(new AllocationRequest("Subha", "Single", "Single-2"));
        allocationQueue.add(new AllocationRequest("Vanmathi", "Suite", "Suite-1"));

        // Process and display confirmation logic
        while (!allocationQueue.isEmpty()) {
            AllocationRequest current = allocationQueue.poll();
            System.out.println("Booking confirmed for Guest: " + current.guestName + 
                               ", Room ID: " + current.roomID);
        }
    }
}