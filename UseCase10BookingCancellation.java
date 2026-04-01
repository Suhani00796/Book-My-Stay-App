import java.util.Stack;

public class UseCase10BookingCancellation {
    public static void main(String[] args) {
        // Display application header
        System.out.println("Booking Cancellation");

        // Initial setup for the rollback scenario
        String roomType = "Single";
        String reservationID = "Single-1";
        int currentAvailability = 5;

        // Inventory Rollback logic
        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
        
        // Restore inventory (Rollback)
        int updatedAvailability = currentAvailability + 1;

        // Use a Stack to track Rollback History (Most Recent First)
        Stack<String> rollbackHistory = new Stack<>();
        rollbackHistory.push("Released Reservation ID: " + reservationID);

        // Display Rollback Report
        System.out.println("\nRollback History (Most Recent First):");
        while (!rollbackHistory.isEmpty()) {
            System.out.println(rollbackHistory.pop());
        }

        System.out.println("\nUpdated Single Room Availability: " + updatedAvailability);
    }
}