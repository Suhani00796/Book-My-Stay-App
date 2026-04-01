import java.util.Scanner;

// Custom Exception for domain-specific errors
class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}

// Mock components to match your code snapshot
class RoomInventory {}
class BookingRequestQueue {}

class ReservationValidator {
    public void validate(String roomType) throws InvalidBookingException {
        // Note: It is case sensitive as per your requirement
        if (!(roomType.equals("Single") || roomType.equals("Double") || roomType.equals("Suite"))) {
            throw new InvalidBookingException("Invalid room type selected.");
        }
    }
}

public class UseCase9ErrorHandlingValidation {
    public static void main(String[] args) {
        // Display application header
        System.out.println("Booking Validation");

        Scanner scanner = new Scanner(System.in);

        // Initialize required components
        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        try {
            System.out.print("Enter guest name: ");
            String name = scanner.nextLine();

            System.out.print("Enter room type (Single/Double/Suite): ");
            String type = scanner.nextLine();

            // Perform validation
            validator.validate(type);
            
            System.out.println("Booking request validated for: " + name);

        } catch (InvalidBookingException e) {
            // Handle domain-specific validation errors
            System.out.println("Booking failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}