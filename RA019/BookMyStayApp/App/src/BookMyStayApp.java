import java.util.HashMap;

/**
 * BookMyStayApp - Entry point
 * @author Ashwitha
 * @version 1.0
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        // ---------------- UC1 ----------------
        System.out.println("====================================");
        System.out.println("   Welcome to BookMyStayApp");
        System.out.println("   Hotel Booking System v1.0");
        System.out.println("====================================\n");

        // ---------------- UC2 ----------------
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // ---------------- UC3 ----------------
        RoomInventory inventory = new RoomInventory();

        // ---------------- UC4 ----------------
        Room[] rooms = {single, doubleRoom, suite};

        RoomSearchService searchService = new RoomSearchService(inventory);

        searchService.searchAvailableRooms(rooms);
    }
}

/**
 * Abstract Room class
 */
abstract class Room {

    protected String type;
    protected int beds;
    protected double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    // Getter (IMPORTANT FIX)
    public String getType() {
        return type;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price per night: ₹" + price);
    }
}

/**
 * Single Room
 */
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000);
    }
}

/**
 * Double Room
 */
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}

/**
 * Suite Room
 */
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }
}

/**
 * Inventory using HashMap
 */
class RoomInventory {

    private HashMap<String, Integer> availability;

    public RoomInventory() {
        availability = new HashMap<>();

        availability.put("Single Room", 5);
        availability.put("Double Room", 3);
        availability.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {
        return availability.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int count) {
        availability.put(roomType, count);
    }
}

/**
 * Search Service (READ-ONLY)
 */
class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void searchAvailableRooms(Room[] rooms) {

        System.out.println("--- Available Rooms (Search Result) ---\n");

        for (Room room : rooms) {

            int available = inventory.getAvailability(room.getType());

            if (available > 0) {
                room.displayDetails();
                System.out.println("Available: " + available + "\n");
            }
        }
    }
}
