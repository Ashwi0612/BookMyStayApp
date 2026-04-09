import java.util.HashMap;

/**
 * Manages room availability using a centralized data structure
 */
class RoomInventory {

    private HashMap<String, Integer> availability;

    // Constructor - initialize inventory
    public RoomInventory() {
        availability = new HashMap<>();

        availability.put("Single Room", 5);
        availability.put("Double Room", 3);
        availability.put("Suite Room", 2);
    }

    // Get availability of a room type
    public int getAvailability(String roomType) {
        return availability.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int count) {
        availability.put(roomType, count);
    }

    // Display full inventory
    public void displayInventory() {
        System.out.println("Room Inventory:\n");

        for (String type : availability.keySet()) {
            System.out.println(type + " → Available: " + availability.get(type));
        }
    }
}
