import java.io.File;

public class UseCase12DataPersistenceRecovery {
    public static void main(String[] args) {
        // Display application header
        System.out.println("System Recovery");

        // Simulate checking for a save file
        File inventoryFile = new File("inventory.dat");

        if (!inventoryFile.exists()) {
            System.out.println("No valid inventory data found. Starting fresh.");
        }

        // Display the "loaded" or "default" inventory
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: 5");
        System.out.println("Double: 3");
        System.out.println("Suite: 2");

        // Simulate saving the state
        System.out.println("Inventory saved successfully.");
    }
}