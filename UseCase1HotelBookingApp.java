public class UseCase1HotelBookingApp {
    public static void main(String[] args) {
        // UC1: Basic Hotel Room Selection Logic
        String guestName = "Suhani";
        String roomType = "Deluxe";
        double pricePerNight = 1500.0;
        int nights = 3;

        double totalBill = pricePerNight * nights;

        System.out.println("--- Hotel Booking Receipt ---");
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomType);
        System.out.println("Total Amount: Rs. " + totalBill);
        System.out.println("-----------------------------");
    }
}