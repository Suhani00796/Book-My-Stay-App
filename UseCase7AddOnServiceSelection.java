public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {
        // Display application header
        System.out.println("Add-On Service Selection");

        // Reservation details
        String reservationID = "Single-1";
        
        // Add-on service costs (Example: Breakfast = 500, Spa = 1000)
        double breakfastCost = 500.0;
        double spaCost = 1000.0;

        // Total calculation
        double totalAddOnCost = breakfastCost + spaCost;

        // Display output matching the screenshot
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Total Add-On Cost: " + totalAddOnCost);
    }
}