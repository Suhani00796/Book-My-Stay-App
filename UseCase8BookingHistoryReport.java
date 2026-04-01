import java.util.ArrayList;
import java.util.List;

class BookingRecord {
    String guestName;
    String roomType;

    BookingRecord(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Guest: " + guestName + ", Room Type: " + roomType;
    }
}

public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {
        // Display application header
        System.out.println("Booking History and Reporting\n");
        System.out.println("Booking History Report");

        // Use a List to maintain an ordered audit trail
        List<BookingRecord> history = new ArrayList<>();

        // Adding confirmed bookings to the history log
        history.add(new BookingRecord("Abhi", "Single"));
        history.add(new BookingRecord("Subha", "Double"));
        history.add(new BookingRecord("Vanmathi", "Suite"));

        // Display the report
        for (BookingRecord record : history) {
            System.out.println(record);
        }
    }
}